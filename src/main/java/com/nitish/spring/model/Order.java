package com.nitish.spring.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Order implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5990035056287828307L;
	/**
	 * 
	 */

	@Id
	private String orderID;
	@Column(name = "ProductName")
	private String productName;

	private String customerName;
	
	@Column(name = "Quantity")
	private String quantity;

	public Order() {

	}

	public Order(String productName, String customerName, String quantity) {
		super();
		this.productName = productName;
		this.customerName = customerName;
		this.quantity = quantity;
	}

}
