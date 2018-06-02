package com.nitish.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nitish.spring.DAO.CustomerJPADAO;
import com.nitish.spring.model.Customer;

//@Service
public class CustomerJPAService implements CustomerServiceInterface {

	@Autowired
	private CustomerJPADAO customerDAO;


	@Override
	public boolean addCustomer(Customer customer) {
		if (customerDAO.save(customer) != null) {
			return true;
		}
		return false;
	}

	@Override
	public Customer getCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCustomer(String id) {
		customerDAO.deleteById(id);
		return true;

	}

	@Override
	public boolean updateCustomer(Customer customer) {
		customerDAO.save(customer);
		return true;
	}

	@Override
	public List<Customer> loadCustomers() {
		List<Customer> customerList = new ArrayList<>();
		customerDAO.findAll().forEach(customerList::add);
		return customerList;
	}

}
