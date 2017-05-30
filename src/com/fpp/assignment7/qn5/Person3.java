package com.fpp.assignment7.qn5;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * @author suresh
 *
 */
public class Person3 {

	private String name;
	private GregorianCalendar dateOfBirth;

	Person3(String name, GregorianCalendar dob) {
		this.name = name;
		dateOfBirth = dob;
	}

	public String getName() {
		return name;
	}

	public GregorianCalendar getDateOfBirth() {
		return (GregorianCalendar) dateOfBirth.clone();
	}

	public boolean equals(Object ob) {
		if (ob == null)
			return false;
		if (!(ob.getClass() ==  getClass()))
			return false;
		Person3 p = (Person3) ob;
		return p.name.equals(name) && p.dateOfBirth.equals(dateOfBirth);
	}

	public int hashCode() {
		int seed = 17;
		int result = 31 * seed + name.hashCode();
		result = 31 * result + dateOfBirth.hashCode();
		return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stb
		GregorianCalendar gregorianCalendar = new GregorianCalendar( 2009, 0, 30 );
//		Person3 p  =  new PersonWithJob3("suresh", gregorianCalendar,9000);
		
		GregorianCalendar gregorianCalendar2 = new GregorianCalendar( 2009, 0, 30 );
//		Person3 p3 = new PersonWithJob3("sureshn", gregorianCalendar, 9000);
		
//		System.out.println("Equals check : "+p.equals(p3));
		

	}

	
	

}
