package com.fpp.assignment7.qn0;

/**
 * 
 * @author suresh
 *
 */
class Account {

	private double balance;

	Account(double balance) {
		this.balance = balance;
	}

	/**
	 * Deposit given amount in the respective account
	 * 
	 * @param deposit
	 *            - amount to be added in current balance
	 */
	public void makeDeposit(double deposit) {
		balance += deposit;
	}

	/**
	 * Make withdrawal if possible and returns boolean value
	 * 
	 * @param amount
	 *            to be withdrawn
	 * @return true is withdraw is success false otherwise
	 */
	public boolean makeWithdrawal(double amount) {
		
		if (amount > balance) {
			System.out.println("Insufficient Fund !!");
			return false;
		} else {
			balance -= amount;
			return true;
		}

	}

	public double getBalance() {
		return balance;
	}
	
	public AccountType getAccountType(){
		return null;
	}

}
