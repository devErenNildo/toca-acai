package com.toca_acai.services;

import com.toca_acai.domain.address.Address;
import com.toca_acai.domain.address.AddressRequestDTO;
import com.toca_acai.domain.address.CepResultDTO;
import com.toca_acai.domain.user.UserClient;
import com.toca_acai.repositories.AddressRepository;
import com.toca_acai.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private UserRepository userRepository;

    private final RestTemplate restTemplate = new RestTemplate();

    public Address creteAddress(AddressRequestDTO addressRequest, String phoneNumber){
        if(addressRequest.houseNumber() == null){
            throw new IllegalArgumentException("House number cannot be null");
        }
        if (addressRequest.postalCode() == null){
            throw new IllegalArgumentException("Postal code cannot be null");
        }
        CepResultDTO cepResultDTO = colsultCep(addressRequest.postalCode());
        Optional<UserClient> user = getUserByPhoneNumber(phoneNumber);
        Address address = new Address();

        address.setPostalCode(cepResultDTO.cep());
        address.setCity(cepResultDTO.localidade());
        address.setNeighborhood(cepResultDTO.bairro());
        address.setRoad(cepResultDTO.logradouro());
        address.setHouseNumber(addressRequest.houseNumber());
        address.setComplement(cepResultDTO.complemento());
        address.setUserClient(user.get());

        return addressRepository.save(address);
    }

    private Optional<UserClient> getUserByPhoneNumber(String phoneNumber){
        return userRepository.findByPhoneNumber(phoneNumber);
    }

    private CepResultDTO colsultCep(String cep){
        String viaCepUrl = "https://viacep.com.br/ws/" + cep + "/json";
        CepResultDTO cepResultDTO = restTemplate.getForObject(viaCepUrl, CepResultDTO.class);
        return cepResultDTO;
    }

}
