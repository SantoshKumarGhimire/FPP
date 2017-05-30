package com.fpp.assignment7.qn0;

/**
 * 
 * @author suresh
 *
 */
public class SavingsAccount extends Account {

	private static double INTEREST_RATE = 0.25;


	public SavingsAccount(Employee employee, double startAmount) {
		super(startAmount);
	}

	/**
	 * public accessor for acctType
	 * 
	 * @return
	 */
	public AccountType getAccountType() {
		return AccountType.SAVINGS;
	}

	/**
	 * returns available balance
	 */
	@Override
	public double getBalance() {
		double baseBalance = super.getBalance();
		double interest = (INTEREST_RATE / 100) * baseBalance;
		return baseBalance + interest;
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
