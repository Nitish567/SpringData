package com.nitish.spring.DAO;

import java.util.List;

import com.nitish.spring.model.Customer;

public interface CustomerDAO {
	
	public boolean addCustomer(Customer customer);
	public Customer getCustomer();
	public boolean deleteCustomer(String id);
	public boolean updateCustomer(Customer customer);
	public List<Customer> loadCustomers();

}
