package com.nitish.spring.DAO;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nitish.spring.model.Customer;

//@Repository
public interface CustomerJPADAO extends CrudRepository<Customer, String>{

}
