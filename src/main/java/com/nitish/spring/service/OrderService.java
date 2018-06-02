package com.nitish.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nitish.spring.DAO.OrderDAO;
import com.nitish.spring.model.Customer;
import com.nitish.spring.model.Order;

@Service
public class OrderService implements OrderServiceInterface {

	@Autowired
	OrderDAO orderDAO;

	@Override
	public boolean addOrder(Order order) {
		if (orderDAO.save(order) != null) {
			return true;
		} else
			return false;
	}

	@Override
	public Order getOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteOrder(String id) {
		orderDAO.deleteById(id);
		return true;
	}

	@Override
	public boolean updateOrder(Order order) {
		orderDAO.save(order);
		return false;
	}

	@Override
	public List<Order> loadOrders() {
		List<Order> orders = new ArrayList<>();
		orderDAO.findAll().forEach(orders::add);
		return orders;
	}

}
