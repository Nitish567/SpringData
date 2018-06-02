package com.nitish.spring.model;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Entity
public class Customer implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9041554490505416865L;
	@Id
	private String customerID;
	private String firstName;
	private String lastName;
	private String email;

	private String username;
	private String password;

	@Embedded
	private Address address;

	public Customer() {

	}

	public Customer(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

//	@Override
//	public String toString() {
//		return "Customer [First Name=" + firstName + ", Last Name=" + lastName + ", email =" + email
//				+ ", Street address=" + address.getAddress() + ", City " + address.getCity() + ", State ="
//				+ address.getState() + " , Zip" + address.getZipCode() + " ]";
//	}
	
	public Customer(String customerID,String firstName, String lastName, String email, String username, String password) {
		this.customerID = customerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [First Name=" + firstName + ", Last Name=" + lastName + ", email =" + email + " ]";
	}

}
