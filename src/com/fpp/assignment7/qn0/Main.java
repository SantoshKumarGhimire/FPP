package com.fpp.assignment7.qn0;

import java.util.Scanner;

/**
 * 
 * @author suresh
 *
 */
public class Main {

	Employee[] emps = null;
	private Scanner sc;

	public static void main(String[] args) {
		new Main().execute();
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

	}

	public void execute() {
		sc = new Scanner(System.in);
		System.out.println("A. See a report of all accounts.");
		System.out.println("B. Make a deposit.");
		System.out.println("C. Make a withdrawal.");
		System.out.println("Please make your selection : ");

		String answer = sc.next();

		if (answer.equalsIgnoreCase("A")) {
			String info = getFormattedAccountInfo();
			System.out.println("\n***************ALL REPORTS INFO***************\n\n" + info);
		} else if (answer.equalsIgnoreCase("B")) {

			int counter = 0;
			for (Employee employee : emps) {
				System.out.println(counter + ". " + employee.getName());
				counter++;
			}

			System.out.println("Select an employee : ");
			int empCode = sc.nextInt();

			counter = 0;
			for (String accName : emps[empCode].getNamesOfAccounts()) {
				System.out.println(counter + ". " + accName);
				counter++;
			}

			System.out.println("Select an account type : ");
			int accountIndex = sc.nextInt();
			System.out.println("Enter amount to be deposited : ");
			double amt = sc.nextDouble();
			emps[empCode].deposit(accountIndex, amt);

		} else if (answer.equalsIgnoreCase("C")) {

			int counter = 0;
			for (Employee employee : emps) {
				System.out.println(counter + ". " + employee.getName());
				counter++;
			}

			System.out.println("Select an employee : ");
			int empCode = sc.nextInt();

			counter = 0;
			for (String accName : emps[empCode].getNamesOfAccounts()) {
				System.out.println(counter + ". " + accName);
				counter++;
			}

			System.out.println("Select an account type : ");
			int accountIndex = sc.nextInt();
			System.out.println("Enter amount to be withdrawn : ");
			double amt = sc.nextDouble();

			emps[empCode].withdraw(accountIndex, amt);

		} else {
			System.out.println("\n**********INVALID SELECTION**********\n");
		}
		System.out.println("Press 'R' to go back to main menu and any other to exit. \n");
		String r = sc.next();
		if(r.equalsIgnoreCase("R")){
			execute();
		}else{
			System.out.println("Thank you for trying me !! , Good bye !!");
		}
		
	}

	/**
	 * 
	 * @return formatted account information
	 */
	String getFormattedAccountInfo() {

		StringBuffer sb = new StringBuffer();
		for (Employee employee : emps) {
			sb.append(employee.getFormattedAcctInfo() + "\n\n");
		}

		return sb.toString();
	}
}
