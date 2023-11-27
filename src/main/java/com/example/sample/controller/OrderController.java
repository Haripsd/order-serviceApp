package com.example.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.model.Order;
import com.example.sample.repository.OrderDao;

@RestController
public class OrderController {

	@Autowired
	private OrderDao orderDao;
	
	
	@GetMapping("/getOrders")
	public List<Order> getOrders() {
		return orderDao.buildOrder();
	}
}
