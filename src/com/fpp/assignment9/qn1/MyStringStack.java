package com.fpp.assignment9.qn1;

public class MyStringStack {

	MyStringLinkedList mll;

	public MyStringStack() {
		mll = new MyStringLinkedList();
	}

	public void push(String data) {
		mll.push(data);
	}

	public String pop() {
		return mll.pop();
	}

	public String peek() {
		return mll.peek();
	}

	public String toString() {
		return mll.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStringStack stack = new MyStringStack();
		stack.push("Bob");
		stack.push("Harry");
		stack.push("Alice");
		System.out.println(stack);
		System.out.println("Popping..." + stack.pop());
		System.out.println(stack);
		System.out.println("Peeking...." + stack.peek());
		System.out.println(stack);
		System.out.println("Popping..." + stack.pop());
		System.out.println(stack);

	}

}
