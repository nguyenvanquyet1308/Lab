package com.example.lab2.bai2;



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

public class ControllerBai2 {
	@RequestMapping("Bai2/student/form")
	public String form(@ModelAttribute("sv") Student sv, Model model) {
		System.out.println("hello here");
		sv.setEmail("Nguyenquyet2017zz@gmail.com");
		sv.setName("Nguyễn Văn Quyết");
		sv.setMarks(10.);
		sv.setGender(false);
		return "Bai2/form";
	}

	@PostMapping("Bai2/student/save")
	public String save(@Valid @ModelAttribute("sv") Student sv, BindingResult result, Model model) {
		System.out.println(result.hasErrors());
		if (result.hasErrors()) {
			model.addAttribute("message", "Vui lòng sửa các lỗi sau:");
			model.addAttribute("errors", result.getAllErrors());
			return "bai2/form";
		}
		return "bai2/save";
	}

	@ModelAttribute("genders")
	public Map<Boolean, String> getGenders() {
		Map<Boolean, String> map = new HashMap<>();
		map.put(true, "Male");
		map.put(false, "Female");
		return map;
	}

	@ModelAttribute("faculties")
	public List<String> getFaculties() {
		return Arrays.asList("CNTT", "DLNHKS", "QTDN");
	}

	@ModelAttribute("hobbies")
	public Map<String, String> getHobbies() {
		Map<String, String> map = new HashMap<>();
		map.put("T", "Travelling");
		map.put("M", "Music");
		map.put("F", "Food");
		map.put("O", "Other");
		return map;
	}

}
