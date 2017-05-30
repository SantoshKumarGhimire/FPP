package com.fpp.assignment7.qn0;

/**
 * 
 * @author suresh
 *
 */
public class CheckingAccount extends Account {

	public CheckingAccount(Employee employee, double startAmount) {
		// TODO Auto-generated constructor stub
		super(startAmount);
	}

	/**
	 * public accessor for acctType
	 * 
	 * @return
	 */
	public AccountType getAccountType() {
		return AccountType.CHECKING;
	}

	/**
	 * returns available balance
	 */
	@Override
	public double getBalance() {
		double baseBalance = super.getBalance();
		return baseBalance -= 5;
	}

	/**
	 * @return Account and Employee details on text
	 */
	@Override
	public String toString() {

		StringBuffer sb = new StringBuffer();
		sb.append("Account Type : " + this.getAccountType() + " with ");
		sb.append("Current balance : " + super.getBalance() + "\n");

		return sb.toString();

	}

}
