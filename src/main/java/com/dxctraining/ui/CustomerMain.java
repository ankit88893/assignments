package com.dxctraining.ui;

import com.dxctraining.entities.*;
import com.dxctraining.exceptions.*;
import com.dxctraining.service.*;

import java.util.*;

public class CustomerMain {

	private ICustomerService service = new CustomerServiceImpl();

	public static void main(String[] args) {
		CustomerMain demo = new CustomerMain();
		demo.runApp();
	}

	public void runApp() {
		try {
			Account account1 = new Account(100, "123ffg");	
			Account account2 = new Account(200, "456gfd");
			
			Customer customer1= new RegularCustomer(1,"ankit",10000,account1,"adhartal");
			service.add(customer1); 
			int id1= customer1.getId();
			Customer customer2= new BusinessCustomer(2,"rahul",20000,account2,"ram nagar");
			service.add(customer2); 
			int id2= customer2.getId();
			
			Customer fetched = service.findById(id2);
			display(fetched);
			
			displayAll();
		}catch(InvalidArgumentException e) {
			e.printStackTrace();
			System.out.print(e.getMessage());
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.print("wrong");
		}
	}

	public void displayAll() {
				List<Customer> list = service.findAll();
				for (Customer customer : list) {
					display(customer);
				}
			}
	

	public void display(Customer customer) {
		System.out.println("customer" + customer.getId() + " " + customer.getName() + " " + customer.getAccount() );
		Account account = customer.getAccount();
		System.out.println("account=" + account.getBalance() + " " + account.getPancard());
		if (customer instanceof RegularCustomer) {
			RegularCustomer rc = (RegularCustomer) customer;
			System.out.println("address is " + rc.getHouseAddress());
		}

		if (customer instanceof BusinessCustomer) {
			BusinessCustomer bc = (BusinessCustomer) customer;
			System.out.println("address is " + bc.getBusinessAddress());
		}

	}

}