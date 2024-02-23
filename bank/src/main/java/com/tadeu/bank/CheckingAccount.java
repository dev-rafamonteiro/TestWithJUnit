package com.tadeu.bank;

public class CheckingAccount extends Account {

	private final double TOTAL_LIMIT;
	private double currentLimit;

	public CheckingAccount(double initBalance, double limit) {
		super(initBalance);
		this.TOTAL_LIMIT = limit;
		this.currentLimit = TOTAL_LIMIT;
	}

	public double getBalance() {
		return super.getBalance() + currentLimit;
	}

	public void deposit(double amount) {
		if (currentLimit < TOTAL_LIMIT) {
			double diference = TOTAL_LIMIT - currentLimit;
			if (diference > amount) {
				currentLimit += amount;
			} else {
				currentLimit = TOTAL_LIMIT;
				super.deposit(amount - diference);
			}
		} else {
			super.deposit(amount);
		}
	}

	public boolean withdraw(double amount) {
		boolean result = false;
		if (amount <= super.getBalance()) {
			result = super.withdraw(amount);
		} else if (amount <= super.getBalance() + getCurrentLimit()) {
			currentLimit -= amount = super.getBalance();;
			result = super.withdraw(super.getBalance());
		}
		return result;
	}

	public double getTOTAL_LIMIT() {
		return TOTAL_LIMIT;
	}

	public double getCurrentLimit() {
		return currentLimit;
	}

}
