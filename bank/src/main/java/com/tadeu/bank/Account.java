package com.tadeu.bank;

public class Account {

	private double balance;

	public Account(double initBalance) {
		balance = initBalance;
	}

	public void deposit(double amount) {

		balance += amount;
	}

	public boolean withdraw(double amount) {
		boolean result = false;
		if (amount <= balance) {
			balance -= amount;
			result = true;
		}
		return result;
	}

	public double getBalance() {
		return balance;
	}
}
