package com.MxStoreDaffy.daffy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MxStoreDaffy.daffy.entity.Category;

public interface CategoryRepo extends JpaRepository<Category,Integer> {
    
}
