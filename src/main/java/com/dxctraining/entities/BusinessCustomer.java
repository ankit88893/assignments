package com.dxctraining.entities;

public class BusinessCustomer extends Customer {
	String businessAddress;

	public BusinessCustomer(int id,String name,double balance,Account account,String businessAddress){
		super(id,name,balance,account);
		this.businessAddress=businessAddress;
	}

	public String getBusinessAddress() {
		return businessAddress;
	}

	void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;

	}
}