package com.fpp.assignment9.qn1;

public class MyStringLinkedList {

	Node header;
	int size = 0;

	public MyStringLinkedList() {
		header = new Node(null, null);
	}

	public void push(String value) {
		Node newNode = new Node(header.pointer, value);
		newNode.pointer = header;
		header = newNode;
		size++;

	}

	public String pop() {
		Node oldNode = header;
		header = header.pointer;
		size--;
		return oldNode.value;
	}

	public String peek() {
		Node oldNode = header;
		// header = header.pointer;
		// size--;
		return oldNode.value;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("--------------\nCurrent Stack\n--------------\n");
		Node current = header;
		while (current != null) {
			builder.append(current).append("\n");
			current = current.pointer;
		}
		return builder.toString();
	}

	/**
	 * Inner class for handling references of next elements
	 * 
	 * @author suresh
	 *
	 */
	class Node {
		String value;
		Node pointer;

		Node(Node pointer, String value) {
			this.pointer = pointer;
			this.value = value;
		}

		public String toString() {
			return value == null ? "" : value;
		}

	}

}
