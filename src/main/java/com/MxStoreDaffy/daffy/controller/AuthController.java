package com.MxStoreDaffy.daffy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MxStoreDaffy.daffy.Utility.JwtUtil;
import com.MxStoreDaffy.daffy.entity.AuthRequest;
import com.MxStoreDaffy.daffy.entity.User;
import com.MxStoreDaffy.daffy.repository.UserRepo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class AuthController {

    @Autowired
    JwtUtil jwtUtil;

    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired  
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder; 
   
    @PostMapping("/authenticate")
    public String doAuthenticate(@RequestBody AuthRequest authRequest) {
         try {
            System.out.println("Authenticating user: " + authRequest.getUsername());
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
            return jwtUtil.generateToken(authRequest.getUsername());

        } catch (Exception ex) {
            return "Error during authentication: " + ex.getMessage();
        }
       
    }
    
   
    @GetMapping("/authenticate")
    public String AddUser(@RequestBody AuthRequest authRequest){
    User user = new User();
        user.setUsername(authRequest.getUsername());
        user.setPassword(passwordEncoder.encode(authRequest.getPassword())); // use injected encoder
        user.setRole("ADMIN");
        userRepo.save(user);
        return "login";
    }
    
}
