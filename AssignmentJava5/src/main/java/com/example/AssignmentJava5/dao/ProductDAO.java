package com.example.AssignmentJava5.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AssignmentJava5.entity.Product;

public interface ProductDAO extends JpaRepository<Product, Integer> {

}
