package com.example.lab5.RepositoryEntity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lab5.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
