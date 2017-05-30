package com.fpp.assigment3.qn1;

public class Main {
	
	public static void main(String[] args) {
		Employee employee = new Employee("Suresh", 45000.0, 2016, 10, 13);
		
		Account checkingAccount = new Account(employee, AccountType.CHECKING,300.00);
		Account savingAccount = new Account(employee, AccountType.SAVINGS,300.00);
		Account retirementAccount = new Account(employee, AccountType.RETIREMENT,300.00);
		
		System.out.println(checkingAccount.toString());
		checkingAccount.makeDeposit(500.00);
		System.out.println(checkingAccount.toString());
		checkingAccount.makeWithdrawal(1000.00);
		System.out.println(checkingAccount.toString());
		employee.raiseSalary(100.00);
		System.out.println(checkingAccount.toString());
		
	}
	
	

}
