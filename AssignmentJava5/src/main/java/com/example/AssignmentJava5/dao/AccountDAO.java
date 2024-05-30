package com.example.AssignmentJava5.dao;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AssignmentJava5.entity.Account;
@EntityScan(basePackages = "com.application.entity")
public interface AccountDAO extends JpaRepository<Account, String> {

}
