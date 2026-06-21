package com.MxStoreDaffy.daffy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.MxStoreDaffy.daffy.entity.User;

public interface UserRepo extends JpaRepository<User, String> {
    
}
