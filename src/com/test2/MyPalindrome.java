package com.test2;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class MyPalindrome {
	Stack<Character> stack = new Stack<>();
	Queue<Character> queue = new LinkedList<>();

	public static void main(String[] args) {

		MyPalindrome mp = new MyPalindrome();
		System.out.println("Palindrome check for given string is : " + mp.isPalindrome(""));
		mp.priorityQueueCheck();
	}

	boolean isPalindrome(String word) {

		char[] c = word.toCharArray();
		/**
		 * Adds element to stack and queue respectively
		 */
		for (int i = 0; i < c.length; i++) {

			stack.add(c[i]);
			queue.offer(c[i]);
		}

		while (stack.size() > 0) {
			if (stack.pop() != queue.poll()) {
				return false;
			}

		}

		return true;
	}
	
	void priorityQueueCheck(){
		
		Queue<String> q = new PriorityQueue<>();
		q.add("apple");
		q.add("aa");
		q.add("axd");
		System.out.println("---PQ---"+q);
		System.out.println("---PQ---"+q.poll());
		System.out.println("---PQ---"+q.poll());
		System.out.println("---PQ---"+q.poll());
		
		
	}

}
