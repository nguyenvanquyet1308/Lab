package com.example.AssignmentJava5.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AssignmentJava5.entity.Orders;

public interface OrdersDAO extends JpaRepository<Orders, Integer> {

}
