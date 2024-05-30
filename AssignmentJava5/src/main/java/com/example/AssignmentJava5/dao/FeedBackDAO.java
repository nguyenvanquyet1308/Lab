package com.example.AssignmentJava5.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AssignmentJava5.entity.FeedBack;

public interface FeedBackDAO extends JpaRepository<FeedBack, Integer> {

}
