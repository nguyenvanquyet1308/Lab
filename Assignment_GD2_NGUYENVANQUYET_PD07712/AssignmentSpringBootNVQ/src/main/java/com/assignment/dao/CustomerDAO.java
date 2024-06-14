package com.assignment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.assignment.entity.*;

@EnableJpaRepositories
public interface CustomerDAO extends JpaRepository<Customer, Integer> {
	
    Customer findByEmail(String email);

}
