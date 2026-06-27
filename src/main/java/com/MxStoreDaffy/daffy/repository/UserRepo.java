package com.MxStoreDaffy.daffy.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.MxStoreDaffy.daffy.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username);
    
}
