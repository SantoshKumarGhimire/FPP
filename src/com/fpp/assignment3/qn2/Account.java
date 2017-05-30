package com.fpp.assignment3.qn2;

class Account {

	private final static double DEFAULT_BALANCE = 0.0;
 
	private double balance;
	private AccountType acctType;
	
	Account(AccountType acctType, double balance) {
		
		this.acctType = acctType;
		this.balance = balance;

	}

	/**
	 * @return Account and Employee details on text
	 */
	public String toString() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("Account Type : "+this.acctType+"\n");
		sb.append("Current balance : "+this.balance+"\n");
		
		return sb.toString();


	}

	/**
	 * Deposit given amount in the respective account
	 * @param deposit - amount to be added in current balance
	 */
	public void makeDeposit(double deposit) {

		// implement
		balance += deposit;

	}

	/**
	 * Make withdrawal if possible and returns boolean value
	 * @param amount to be withdrawn
	 * @return true is withdraw is success false otherwise
	 */
	public boolean makeWithdrawal(double amount) {

		// implement
		if (amount > balance) {
			System.out.println("Insufficient Fund !!");
			return false;
		} else {
			balance -= amount;
			return true;
		}

	}
	
	/**
	 * public accessor for acctType
	 * @return
	 */
	public AccountType getAccountType(){
		return this.acctType;
	}


}

