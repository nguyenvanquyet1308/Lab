package com.assignment.library;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.assignment.entity.Customer;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Service
public class SessionService {
	@Autowired HttpSession session;

	public SessionService(HttpSession session) {
		this.session = session;
	}
		
	public void set(String key, String value) {
		session.setAttribute(key, value);
	}
	
	public static Object get(HttpServletRequest request, String name) {
		HttpSession session = request.getSession();
		return session.getAttribute(name);
	}

	public static void invalidate(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.removeAttribute("username");
		session.invalidate();
	}

	public static boolean isLogin(HttpServletRequest request) {
		return get(request, "username") != null;
	}

	public static String getLoginedUsername(HttpServletRequest request) {
		Object username = get(request, "username");
		return username == null ? null : username.toString();
	}

//	public static boolean isAdmin() {
//		return isAdmin() && Customer.getAdmin() == true;
//	}
}
