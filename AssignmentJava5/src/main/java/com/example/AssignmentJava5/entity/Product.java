package com.example.AssignmentJava5.entity;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

@Data
@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;

	private String name;

	private Integer quantity;

	private Float unitPrice;

	private String image;

	private String description;

	private Float discount;

	@Temporal(TemporalType.DATE)
	private Date createDate;

	private Integer status;

	@ManyToOne
	@JoinColumn(name = "categoryId")
	private Category category;
}
