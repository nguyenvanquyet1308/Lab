package com.example.lab5.RepositoryEntity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lab5.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
