package com.example.AssignmentJava5.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AssignmentJava5.entity.Category;

public interface CategoryDAO extends JpaRepository<Category, Integer> {

}
