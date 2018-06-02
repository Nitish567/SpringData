package com.nitish.spring.service;

import java.util.List;

import com.nitish.spring.model.Customer;
import com.nitish.spring.model.Order;

public interface OrderServiceInterface {

	boolean addOrder(Order order);

	Order getOrder();

	boolean deleteOrder(String id);

	boolean updateOrder(Order order);

	List<Order> loadOrders();

}