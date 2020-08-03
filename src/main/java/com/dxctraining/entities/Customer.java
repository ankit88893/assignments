package com.dxctraining.entities;

public class Customer {
	int id;
	String name;
	double balance;
	private Account account;

	Customer(int id, String name, double balance, Account account) {
		this.account = account;
		this.name = name;
		this.balance = balance;
		this.id=id;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override

	public String toString() {
		String str = name + " " + id + " " + balance;
		return str;
	}
}
