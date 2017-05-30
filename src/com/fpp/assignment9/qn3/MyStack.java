package com.fpp.assignment9.qn3;

import java.util.Stack;

public class MyStack {

	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();
	Stack<Integer> stack3 = new Stack<>();

	int[] arr = { -1, 15, 23, 44, 4, 9 };

	public void pushElements() {
		for (int i : arr) {
			stack1.push(i);
			stack2.push(i);
		}
	}

	public void moveFirstToThird() {
		while (!stack1.isEmpty()) {
			stack3.push(stack1.pop());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStack myStack = new MyStack();
		myStack.pushElements();
		myStack.moveFirstToThird();
		while (!myStack.stack3.isEmpty()) {
			System.out.println("From Stack3 : " + myStack.stack3.pop());
			System.out.println("From Stack2 : " + myStack.stack2.pop());
		}

	}

}
