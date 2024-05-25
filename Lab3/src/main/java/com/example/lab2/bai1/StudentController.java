package com.example.lab2.bai1;

import java.util.Arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lab2.model.Student;

import jakarta.validation.Valid;

@Controller

public class StudentController {
	@RequestMapping("/student/form")
	public String form(@ModelAttribute("sv") Student sv, Model model) {
//		sv.setEmail("nguyenquyet2017zz@gmail.com");
//		sv.setName("Nguyễn Văn Quyết");
//		sv.setMarks(Double.valueOf(10));
//		sv.setGender(false);
//		sv.setFaculty("KT");
		// model.addAttribute("sv",sv);

		return "form";
	}

	 @PostMapping("/student/save")
	    public String save(@Valid @ModelAttribute("sv") Student sv, BindingResult errors, Model model) {
	        if (errors.hasErrors()) {
	          //  model.addAttribute("message", "Vui lòng sửa các lỗi sau:");
	        	 System.out.println("đã chạy tơi đây q");
	            return "form"; // Return to the form view to display errors
	        } else {
	            model.addAttribute("message", "Chúc mừng, bạn đã nhập đúng");
	            System.out.println("đã chạy tơi đây");
	            return "save"; // Proceed to the result view
	        }
	    }


}
