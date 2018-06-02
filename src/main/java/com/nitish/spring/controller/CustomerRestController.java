package com.nitish.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.format.number.CurrencyStyleFormatter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nitish.spring.model.Customer;
import com.nitish.spring.service.CustomerServiceInterface;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/customers")
public class CustomerRestController {

	@Autowired	
	@Qualifier("customerJPAService")
	CustomerServiceInterface customerServiceInterface;
	
	@RequestMapping(value = "/Hello")
	public String helloForm(){
		return "hello";
	}

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public ResponseEntity<?> loadUsers() {

		List<Customer> customerList= customerServiceInterface.loadCustomers();
		return new ResponseEntity<List<Customer>>(customerList, HttpStatus.OK);

	}

	@RequestMapping(value = { "/" }, method = RequestMethod.POST)
	public ResponseEntity<?> addUser(@RequestBody Customer customer) {
		
		System.out.println(customer);

		customerServiceInterface.addCustomer(customer);

		return new ResponseEntity<Customer>(customer, HttpStatus.CREATED);

	}

	@RequestMapping(value = { "/{customerID}"}, method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteUser(@PathVariable String customerID) {
		boolean deleted = customerServiceInterface.deleteCustomer(customerID);
//		List<Customer> customerList = customerServiceInterface.loadCustomers();
//		return new ResponseEntity<List<Customer>>(, HttpStatus.OK);
		if(deleted){
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		}
		else{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

	@RequestMapping(value = { "/" }, method = RequestMethod.PUT)
	public ResponseEntity<?> updateUser(@RequestBody Customer customer) {
		if(customerServiceInterface.updateCustomer(customer)){
			return new ResponseEntity<>(HttpStatus.OK);
		}
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);

	}

}
