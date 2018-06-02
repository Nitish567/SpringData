package com.nitish.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nitish.spring.service.OrderServiceInterface;

@RestController
@RequestMapping(value = "/order")
public class OrderController {
	
	@Autowired
	OrderServiceInterface orderService;
	
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String helloOrder(){
		orderService.loadOrders();
		return "hello";
	}

}
