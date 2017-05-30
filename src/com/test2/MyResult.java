package com.test2;
import java.util.Scanner;

public class MyResult {

	private int marks;
	private MyResult myResult;

	public MyResult() {
		this.myResult = null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int i = 0;
		MyResult r1 = new MyResult();

		System.out.println("Enter marks awarded to student-" + (++i) + " : ");
		int marks = sc.nextInt();
		r1.marks = marks;
		MyResult temp = r1;
		while (i < 5) {
			System.out.println("Enter marks awarded to student-" + (i + 1) + " : ");
			marks = sc.nextInt();

			r1.myResult = new MyResult();
			r1.myResult.marks = marks;
			
			r1 = r1.myResult;// links the node
			i++;
		}

		r1 = temp;

		while (r1 != null) {
			System.out.println("---> " + r1.marks);
			r1 = r1.myResult;
		}

	}

}
