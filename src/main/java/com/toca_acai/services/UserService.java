package com.toca_acai.services;

import com.toca_acai.domain.user.UserClient;
import com.toca_acai.domain.user.UserRequestDTO;
import com.toca_acai.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserClient> findAll(){
        return userRepository.findAll();
    }

    public UserClient save(UserRequestDTO requestDTO){
        UserClient user = new UserClient(requestDTO.name(), requestDTO.phoneNumber());
        return userRepository.save(user);
    }
}
