package com.fpp.assignment7.qn5;

import java.util.GregorianCalendar;

/**
 * 
 * @author suresh
 *
 */
public class PersonWithJob2 extends Person2 {

	private double salary;

	PersonWithJob2(String name, GregorianCalendar dob, double salary) {
		super(name, dob);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	/**
	 * checks if passed object is equals to another or not
	 */
	@Override
	public boolean equals(Object ob) {

		if (ob == null)
			return false;

		if (ob.getClass().getSimpleName().equals(this.getClass().getSimpleName())) {
			PersonWithJob2 p = (PersonWithJob2) ob;
			return super.getName().equals(p.getName()) && super.getDateOfBirth().equals(p.getDateOfBirth())
					&& salary == p.getSalary();
		}

		return false;

	}
}
