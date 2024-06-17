package com.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assignment.dao.OrderDetailDAO;
import com.assignment.dao.OrdersDAO;
import com.assignment.entity.OrderDetail;
import com.assignment.entity.Orders;
import com.assignment.library.SessionService;

@Controller
public class ShowOrder {

	@Autowired
	SessionService sessionService;
	@Autowired 
	OrdersDAO daoOrders;
	@Autowired
	OrderDetailDAO daoOrderDetail;
	
	@RequestMapping("/donHang")
	public String Show(Model model) {
		
		if(sessionService.isLogin()) {
			
			OrderDetail orders = new OrderDetail();
			model.addAttribute("orderDetail",orders);
			List<OrderDetail> item = daoOrderDetail.findAll();
			model.addAttribute("itemOrderDetail",item);
			
			
			return "viewOrder/showOrder";
		}
		else {
			
			return "viewLogin/dangNhap";
		}
		
		
	}
	
}
