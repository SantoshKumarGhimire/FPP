package com.fpp.assignment3.qn2;

import java.util.Scanner;

public class Main {

	Employee[] emps = null;
	private Scanner sc;

	public static void main(String[] args) {

		new Main();

	}

	Main() {

		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2, 13);
		
		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);
		
		/**
		 * Deposit amount to respective amount
		 */
		emps[0].deposit(AccountType.SAVINGS, 1000);
		emps[1].deposit(AccountType.CHECKING, 1000);
		emps[2].deposit(AccountType.RETIREMENT, 1000);
		
		/**
		 * Withdraw from respective amount if possible
		 */
		emps[0].withdraw(AccountType.SAVINGS, 2000);
		emps[1].withdraw(AccountType.CHECKING, 2000);
		emps[2].withdraw(AccountType.RETIREMENT, 2000);
		
		
		
		
		

		sc = new Scanner(System.in);
		System.out.print("See a report of all account balances? (y/n) ");
		String answer = sc.next();
		
		if (answer.equalsIgnoreCase("y")) {
			String info = getFormattedAccountInfo();
			System.out.println("\n***************INFO***************\n" + info);

		}

	}

	String getFormattedAccountInfo() {

		StringBuffer sb = new StringBuffer();
		for (Employee employee : emps) {
			sb.append(employee.getFormattedAcctInfo()+"\n\n");
		}

		return sb.toString();
	}
}
