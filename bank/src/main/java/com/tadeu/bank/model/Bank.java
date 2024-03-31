package com.tadeu.bank.model;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	private String name;
	private List<Customer> customerList;

	public Bank(String name) {
		this.name = name;
		customerList = new ArrayList<Customer>();
	}

	public void addCustomer(Customer c) {
		customerList.add(c);
	}

	public Customer getCustomer(int position) {
		return customerList.get(position);
	}

	public String getName() {
		return name;
	}

	public List<Customer> getCustomerList() {
		return customerList;
	}

}
