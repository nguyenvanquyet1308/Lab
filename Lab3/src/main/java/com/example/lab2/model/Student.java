package com.example.lab2.model;

import java.util.List;

import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@NotBlank(message = "không được bỏ trống username")
	String name;
	@NotBlank(message = "Vui Lòng không bỏ trống Email")
	@Email(message = "Vui lập nhập đúng định dạng Email")
	String email;
	@Range(min = 1, max = 10, message = "điểm nằm trong khoảng 1->10")
	@NotNull(message = "Không được bỏ trống điểm")
	Double marks;
	@NotNull(message = "Không được bỏ trống gender")
	boolean gender;
	@NotEmpty(message = "Vui lòng chọn chuyên ngành")
	private List<String> faculties;
	@NotEmpty
	List<String> hobbies;
}
