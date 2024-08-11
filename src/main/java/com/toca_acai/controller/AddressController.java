package com.toca_acai.controller;

import com.toca_acai.domain.address.Address;
import com.toca_acai.domain.address.AddressRequestDTO;
import com.toca_acai.domain.address.CepResultDTO;
import com.toca_acai.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/{phoneNumber}")
    public ResponseEntity<Address> addAddress (@RequestBody AddressRequestDTO addressRequestDTO, @PathVariable String phoneNumber){
        Address address = addressService.creteAddress(addressRequestDTO, phoneNumber);
        return ResponseEntity.ok(address);
    }

}
