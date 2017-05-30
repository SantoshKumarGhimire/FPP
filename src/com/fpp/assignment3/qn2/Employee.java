package com.fpp.assignment3.qn2;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private Date hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		GregorianCalendar cal = new GregorianCalendar(yearOfHire, monthOfHire - 1, dayOfHire);
		hireDate = cal.getTime();
	}

	public void createNewChecking(double startAmount) {
		checkingAcct = new Account(AccountType.CHECKING, startAmount);
	}

	public void createNewSavings(double startAmount) {
		savingsAcct = new Account(AccountType.SAVINGS, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		retirementAcct = new Account(AccountType.RETIREMENT, startAmount);
				
	}

	public void deposit(AccountType acctType, double amt) {
		
		switch (acctType) {
		case CHECKING:
			checkingAcct.makeDeposit(amt);
			break;
		case SAVINGS:
			savingsAcct.makeDeposit(amt);
			break;
		case RETIREMENT:
			retirementAcct.makeDeposit(amt);
			break;
		default:
			break;
		}
	}

	public boolean withdraw(AccountType acctType, double amt) {
	
		boolean withDrawStatus = false;
		
		switch (acctType) {
		case CHECKING:
			withDrawStatus = checkingAcct.makeWithdrawal(amt);
			break;
		case SAVINGS:
			withDrawStatus = savingsAcct.makeWithdrawal(amt);
			break;
		case RETIREMENT:
			withDrawStatus = retirementAcct.makeWithdrawal(amt);
			break;
		default:
			break;
		}
		return withDrawStatus;

	}

	public String getFormattedAcctInfo() {
		StringBuffer sb = new StringBuffer();
		sb.append("ACCOUNT INFO FOR "+name+": \n");
		
		Account[] ac = {checkingAcct,savingsAcct,retirementAcct};
		
		for (Account account  : ac) {
			if(account != null){
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
