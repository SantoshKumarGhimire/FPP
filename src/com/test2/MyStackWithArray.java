package com.test2;


/**
 * Array implementation of Stack.
 * @author 985462
 *
 */
public class MyStackWithArray {
	int top;
	Object[] elements;
    int stackSize = 3;
	MyStackWithArray() {
		this.top = -1;
		this.elements = new Object[stackSize];
	}

	public void push(Object obj) {
		if (this.top == elements.length - 1) {
			System.out.println("---> Stack is full hence increasing stack size...");
			increaseStackCapacity();
//			return;
		}
		top++;
		elements[top] = obj.toString();
	}
	
	public void increaseStackCapacity(){
		Object[] newStack = new Object[this.stackSize+1];
        for(int i=0;i<size();i++){
            newStack[i] = this.elements[i];
        }
        this.elements = newStack;
        this.stackSize = this.stackSize+1;
	}

	public Object pop() {
		if (this.top == -1) {
			System.out.println("---> Stack is empty please push first");
			return null;
		}
		Object ob = elements[top];
		top--;
		return ob;

	}

	public Object peek(Object obj) {
		if (elements.length == 0)
			return null;
		return elements[top];
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (int i = size() - 1; i >= 0; i--) {
			sb.append(elements[i] + "\n");
		}

		return sb.toString();
	}

	public int size() // returns number of items in the stack
	{
		return top + 1;
	}

	public static void main(String[] args) {

		MyStackWithArray myStack = new MyStackWithArray();
		myStack.push("apple");
		myStack.push("ball");
		myStack.push("cat");
		System.out.println("Elements popped :" + myStack.pop());
//		myStack.pop();
		myStack.push("dog");
		myStack.push("egg");

		System.out.println("----------------\nRemaining stack\n----------------\n"+myStack);

	}

}
