package com.MxStoreDaffy.daffy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MxStoreDaffy.daffy.entity.Product;

public interface ProductRepo extends JpaRepository<Product,Integer> {
    
}
