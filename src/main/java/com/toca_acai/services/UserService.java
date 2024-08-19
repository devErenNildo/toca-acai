package com.toca_acai.services;

import com.toca_acai.domain.user.User;
import com.toca_acai.domain.user.UserRequestDTO;
import com.toca_acai.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User save(UserRequestDTO requestDTO){
        User user = new User(requestDTO.name(), requestDTO.phoneNumber());
        return userRepository.save(user);
    }
}
