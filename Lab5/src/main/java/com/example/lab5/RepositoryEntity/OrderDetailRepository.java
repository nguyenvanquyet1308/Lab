package com.example.lab5.RepositoryEntity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lab5.entity.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {

}
