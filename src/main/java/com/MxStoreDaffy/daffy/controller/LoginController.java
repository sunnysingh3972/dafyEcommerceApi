package com.MxStoreDaffy.daffy.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.MxStoreDaffy.daffy.entity.User;
import com.MxStoreDaffy.daffy.repository.UserRepo;
import org.springframework.security.crypto.password.PasswordEncoder;

@RestController
public class LoginController {

    @Autowired  
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/login")
    public String login() {
        
        return "login";
    }
}
