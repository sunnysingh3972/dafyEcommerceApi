package com.MxStoreDaffy.daffy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MxStoreDaffy.daffy.entity.Cart;

public interface CartRepo extends JpaRepository<Cart,Integer> {
    
}
