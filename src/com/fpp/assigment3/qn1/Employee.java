package com.fpp.assigment3.qn1;

import java.util.Date;
import java.util.GregorianCalendar;

class Employee {

	// constructor

	Employee(String aName,double aSalary,int aYear,int aMonth,int aDay) {
		name = aName;
		salary = aSalary;
		GregorianCalendar cal =	new GregorianCalendar(aYear, aMonth - 1, aDay);

		hireDay = cal.getTime();

	}

	// instance methods
	public String getName() {

		return name;

	}

	public double getSalary() {

		return salary;

	}

	// needs to be improved!!
	public Date getHireDay() {

		return hireDay;

	}

	public void raiseSalary(double byPercent) {

		double raise = salary * byPercent / 100;
		salary += raise;

	}

	// instance fields

	private String name;
	private double salary;
	private Date hireDay;

}