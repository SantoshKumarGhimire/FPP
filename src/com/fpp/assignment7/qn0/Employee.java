package com.fpp.assignment7.qn0;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * @author suresh
 *
 */
public class Employee {

	private AccountList accounts = new AccountList();

	private String name;
	private Date hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		GregorianCalendar cal = new GregorianCalendar(yearOfHire, monthOfHire - 1, dayOfHire);
		hireDate = cal.getTime();
	}

	public void createNewChecking(double startAmount) {
		Account acct = new CheckingAccount(this, startAmount);
		accounts.add(acct);
	}

	public void createNewSavings(double startAmount) {
		Account acct = new SavingsAccount(this, startAmount);
		accounts.add(acct);
	}

	public void createNewRetirement(double startAmount) {
		Account acct = new RetirementAccount(this, startAmount);
		accounts.add(acct);

	}

	/**
	 * 
	 * @param accountIndex index that refers to account type
	 * @param amt amount to be deposited
	 */
	public void deposit(int accountIndex, double amt) {

		Account selected = accounts.get(accountIndex);
		System.out.println("Before Now your balance is : $" + selected.getBalance());
		selected.makeDeposit(amt);
		System.out.println("$" + amt + " has been deposited in the \nsaving account of " + this.getName());
		System.out.println("Now your balance is : $" + selected.getBalance());

	}

	/**
	 * 
	 * @return string array of account selected user has
	 */
	public String[] getNamesOfAccounts() {
		String[] accountNameList = new String[accounts.size()];
		System.out.println("Size: "+accounts.size());
		for (int i = 0; i < accounts.size(); i++) {
			Account account = accounts.get(i);
			if (account != null) {
				accountNameList[i] = account.getAccountType().toString().toLowerCase();
			}
			
		}
		return accountNameList;
	}


	/**
	 * 
	 * @param accountIndex index that refers to account type
	 * @param amt amount to be withdrawn
	 */
	public boolean withdraw(int accountIndex, double amt) {
		Account selected = accounts.get(accountIndex);
		System.out.println("Before your balance is : $" + selected.getBalance());
		boolean flag = selected.makeWithdrawal(amt);
		System.out.println("$" + amt + " has been withdrawn now your balance is "+selected.getBalance());
		return flag;

	}

	public String getFormattedAcctInfo() {
		StringBuffer sb = new StringBuffer();
		sb.append("Account details of : " + this.getName() + "\n---------------------------------------\n");
		for (int i = 0; i < accounts.size(); i++) {
			Account account = accounts.get(i);
			if (account != null) {
				sb.append(account.toString());
			}
		}

		return sb.toString();
	}

	public String getName() {
		return name;
	}

	public Date getHireDate() {
		return hireDate;
	}
}
