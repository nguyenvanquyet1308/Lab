package com.example.AssignmentJava5.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AssignmentJava5.entity.OrderDetail;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, Integer> {

}