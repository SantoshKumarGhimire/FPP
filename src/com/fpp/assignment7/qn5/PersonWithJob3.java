package com.fpp.assignment7.qn5;

import java.util.GregorianCalendar;

/**
 * 
 * @author suresh
 *
 */
public class PersonWithJob3 {

	private double salary;
	private String name;
	private GregorianCalendar dateOfBirth;
	private Person person;

	PersonWithJob3(String name, GregorianCalendar dob, double salary) {
		this.name = name;
		this.dateOfBirth = dob;
		this.salary = salary;
		this.person = new Person(name,dob);

	}

	public double getSalary() {
		return salary;
	}

	/**
	 * checks if passed object is equals to another or not
	 */
	public boolean equals(Object ob) {

		if (ob == null)
			return false;
		//
		if (ob.getClass() == this.getClass()) {

			 PersonWithJob3 p = (PersonWithJob3) ob;
			 return person.getName().equals(name) && person.getDateOfBirth().equals(dateOfBirth) && p.salary == salary;
		}

		return false;

	}
}
