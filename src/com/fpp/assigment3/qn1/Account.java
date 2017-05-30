package com.fpp.assigment3.qn1;

class Account {

	private final static double DEFAULT_BALANCE = 0.0;

	private double balance;
	private AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;

	}

	Account(Employee emp, AccountType acctType) {

		this(emp, acctType, DEFAULT_BALANCE);

	}

	/**
	 * @return Account and Employee details on text
	 */
	public String toString() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("Name : "+employee.getName()+"\n");
		sb.append("Salary : "+employee.getSalary()+"\n");
		sb.append("Hire Date : "+employee.getHireDay()+"\n");
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
	
	/**
	 * public accessor for employee
	 * @return
	 */
	public Employee getEmployee(){
		return this.employee;
	}

}

