package com.nitish.spring.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nitish.spring.model.Order;

@Repository
public interface OrderDAO extends CrudRepository<Order, String>{

}
