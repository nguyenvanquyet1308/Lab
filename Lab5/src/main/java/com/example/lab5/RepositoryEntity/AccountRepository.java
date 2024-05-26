package com.example.lab5.RepositoryEntity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lab5.entity.Account;

public interface AccountRepository extends JpaRepository<Account, String> {
	
	

}
