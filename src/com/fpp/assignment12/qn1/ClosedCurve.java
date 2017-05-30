package com.fpp.assignment12.qn1;

import java.util.Scanner;
import java.util.logging.Logger;

public class ClosedCurve {
	Logger log = Logger.getLogger("trylogs");
	private static Scanner s;

	public static void main(String[] args) {
		new ClosedCurve().compute();
	}

	public void compute() {
		s = new Scanner(System.in);

		System.out.println("Please enter your choice :");
		System.out.println("1. Area of Circle:");
		System.out.println("2. Area of Square:");
		System.out.println("3. Area of Rectangle:");
		System.out.println("Please ensure all lengths are below 100 :");

		int choice = s.nextInt();
		try {
			computeArea(choice);
		} catch (MyExceptions e) {
			System.out.println("My Exception :  " + e);
			log.info("My Exception :  " + e);
		}
	}

	public void computeArea(int choice) throws MyExceptions {

		double area = 0.00;
		switch (choice) {
		case 1:
			System.out.println("Enter the length of radius : ");
			double radius = s.nextDouble();
			if (radius > 100)
				throw new MyExceptions("Circle");

			area = 3.1416 * Math.pow(radius, 2);
			System.out.println("Area of circle is : " + area);
			log.info("Area of circle is : " + area);
			break;

		case 2:
			System.out.println("Enter the length of square : ");
			double side = s.nextDouble();
			if (side > 100)
				throw new MyExceptions("Square");
			area = side * side;
			System.out.println("Area of square is : " + area);
			log.info("Area of square is : " + area);
			break;

		case 3:
			System.out.println("Enter the length of rectangle : ");
			double length = s.nextDouble();
			System.out.println("Enter the breadth of rectangle : ");
			double breath = s.nextDouble();
			if (length > 100 || breath > 100)
				throw new MyExceptions("Rectangle");
			area = length * length;
			System.out.println("Area of rectangle is : " + area);
			log.info("Area of rectangle is : " + area);
			break;

		default:
			break;
		}

		System.out.println("Normal Exit");
	}

}

/**
 * Exception handler class
 * 
 * @author suresh
 *
 */
class MyExceptions extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String shape;

	MyExceptions(String shape) {
		this.shape = shape;
	}

	public String toString() {
		return "Exception occured while calculating area of [" + shape + "]";
	}
}
