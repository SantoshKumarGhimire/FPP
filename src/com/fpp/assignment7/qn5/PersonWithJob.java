package com.fpp.assignment7.qn5;

import java.util.GregorianCalendar;

/**
 * 
 * @author suresh
 *
 */
public class PersonWithJob extends Person {
	
	private double salary;
	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		super(name, dob);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
}
