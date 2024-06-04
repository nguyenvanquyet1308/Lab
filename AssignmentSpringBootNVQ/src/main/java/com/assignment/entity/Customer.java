package com.assignment.entity;

import lombok.Data;



import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Data
@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerId;

	private String name;

	@Column(unique = true)
	private String email;

	private String password;

	private String phone;

	@Temporal(TemporalType.DATE)
	private Date registeredDate;

	private Integer status;
}
