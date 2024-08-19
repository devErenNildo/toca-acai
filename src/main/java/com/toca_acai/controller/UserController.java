package com.toca_acai.controller;

import com.toca_acai.domain.user.User;
import com.toca_acai.domain.user.UserRequestDTO;
import com.toca_acai.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){
        List<User> user = userService.findAll();
        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody UserRequestDTO requestDTO){
        return ResponseEntity.ok(userService.save(requestDTO));
    }



//    public UserClient createUser(@RequestBody UserRequestDTO user){
//        return userService.save(user);
//    }
}
