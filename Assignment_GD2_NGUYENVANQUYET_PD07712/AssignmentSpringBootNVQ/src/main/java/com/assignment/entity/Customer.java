package com.assignment.entity;

import lombok.Data;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.PositiveOrZero;

@Data
@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerId;

	@NotBlank(message = "Không được để trống tên khác hàng!")
	private String name;
	@NotBlank(message = "Không được để trống email!")
	@Email(message = "Không đúng định dạng email!")
	private String email;

	@NotBlank(message = "Không được để trống mật khẩu!")
	private String password;

	@Pattern(regexp = "^0[0-9]{9}$", message = "Phone number must start with 0 and have 10 digits")
	private String phone;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date registeredDate;

	private boolean admin;
}
