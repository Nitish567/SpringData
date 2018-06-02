package com.nitish.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nitish.spring.DAO.CustomerDAO;
import com.nitish.spring.model.Customer;

//@Service
public class CustomerService implements CustomerServiceInterface {

	@Autowired
	CustomerDAO customerDAO;

	@Override
	public boolean addCustomer(Customer customer) {

		customerDAO.addCustomer(customer);
		return false;
	}

	@Override
	public Customer getCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCustomer(String id) {
		customerDAO.deleteCustomer(id);
		return false;
	}

	@Override
	public boolean updateCustomer(Customer customer) {

		if (customerDAO.updateCustomer(customer)) {
			return true;
		} else
			return false;

	}

	@Override
	public List<Customer> loadCustomers() {

		List<Customer> customerList = customerDAO.loadCustomers();
		return customerList;
	}

}
