package com.example.lab5.lab6.bai2;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;

@Service
public class SessionService {
	@Autowired
	HttpSession session;

	public SessionService(HttpSession session) {
		this.session = session;
	}

	public void set(String key, String value) {
		session.setAttribute(key, value);
	}

	public String get(String key, String defaultValue) {
		String value = (String) session.getAttribute(key);
		return value != null ? value : defaultValue;
	}
}
