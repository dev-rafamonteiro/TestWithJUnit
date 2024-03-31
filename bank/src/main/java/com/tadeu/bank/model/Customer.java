package com.tadeu.bank.model;

import com.tadeu.bank.Account;

import java.util.Date;

public class Customer {

	private String firstName;
	private String lastName;
	private String address;
	private Date dateOfBirthday;
	private Account account;

	public Customer(String firstName, String lastName, String address, Account account) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.account = account;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDateOfBirthday() {
		return dateOfBirthday;
	}

	public void setDateOfBirthday(Date dateOfBirthday) {
		this.dateOfBirthday = dateOfBirthday;
	}

	public Account getAccount() {
		return account;
	}

	public void updateCustomerDetails(String jane, String smith, String s) {
	}
}
