package com.dxctraining.entities;
public class RegularCustomer extends Customer{
	
	String houseAddress;
	
	public RegularCustomer(int id,String name,double balance, Account account,String houseAddress){
		super(id,name,balance, account);
		this.houseAddress=houseAddress;
		
	}
	public String getHouseAddress(){
		return houseAddress;	
		}
	
	void setHouseAddress(String houseAddress){
		this.houseAddress=houseAddress;

	}
}
