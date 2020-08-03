package com.dxctraining.dao;

import java.util.List;

import com.dxctraining.entities.Customer;

public interface ICustomerDao {
	
	Customer findById(int id);
	List<Customer> findAll();
	void add(Customer customer);
	Customer updateName(int id, String newName);
	Customer update(Customer customer);
	void delete(int id);
	
	
	

}
