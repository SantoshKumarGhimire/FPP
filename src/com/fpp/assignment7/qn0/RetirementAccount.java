package com.fpp.assignment7.qn0;

/**
 * 
 * @author suresh
 *
 */
public class RetirementAccount extends Account {

	private static double PENALTY_RATE = 0.25;

	public RetirementAccount(Employee employee, double startAmount) {
		super(startAmount);
	}

	/**
	 * public accessor for acctType
	 * 
	 * @return
	 */
	public AccountType getAccountType() {
		return AccountType.RETIREMENT;
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

	/**
	 * Make withdrawal if possible and returns boolean value with applicable penalty
	 * 
	 * @param amount
	 *            to be withdrawn
	 * @return true is withdraw is success false otherwise
	 */
	@Override
	public boolean makeWithdrawal(double amount) {
		
		double balance = super.getBalance();
		double penalty = (PENALTY_RATE / 100) * balance;
		if ((amount + penalty) > balance) {
			System.out.println("Insufficient Fund !!");
			return false;
		} else {
			balance -= (amount + penalty);
			return true;
		}

	}
}
