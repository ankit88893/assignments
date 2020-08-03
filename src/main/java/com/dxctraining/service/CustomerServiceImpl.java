package com.dxctraining.service;

import java.util.List;
import com.dxctraining.dao.*;
import com.dxctraining.entities.Customer;
import com.dxctraining.exceptions.*;

public class CustomerServiceImpl implements ICustomerService {

	private ICustomerDao dao = new CustomerDaoImp();

	@Override
	public Customer findById(int id) {
		checkId(id);
		Customer customer = dao.findById(id);
		return customer;
	}

	@Override
	public List<Customer> findAll() {
		List<Customer> list = dao.findAll();
		return list;
	}

	public void checkId(int id) {
		if (id < 1) {
			throw new InvalidArgumentException("id cant be negative, id passed=" + id);
		}
	}

	public void checkName(String name) {
		if (name == null || name.isEmpty()) {
			throw new InvalidArgumentException("name cant be null or empty");
		}
	}

	public void checkCustomer(Customer customer) {
		if (customer == null) {
			throw new InvalidArgumentException("customer cant be null or empty");

		}
	}

	@Override
	public Customer updateName(int id, String newName) {
		checkId(id);
		checkName(newName);
		Customer customer = dao.updateName(id, newName);
		return customer;
	}

	@Override
	public Customer update(Customer customer) {
		checkCustomer(customer);
		customer = dao.update(customer);
		return customer;
	}

	@Override
	public void add(Customer customer) {
		checkCustomer(customer);
		dao.add(customer);

	}

	@Override
	public void delete(int id) {
		checkId(id);
		dao.delete(id);
	}

}