package com.MxStoreDaffy.daffy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MxStoreDaffy.daffy.entity.CartProduct;

public interface CartProductRepo extends JpaRepository<CartProduct,Integer> {
    
}
