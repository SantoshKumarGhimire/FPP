package com.test2;

public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = new Node(null, null, null);
	}

	public void add(String item) {
		Node n = new Node(header.next, header, item);
		if (header.next != null) {
			header.next.previous = n;
		}
		header.next = n;


	}

	class Node {
		String value;
		Node next;
		Node previous;

		Node(Node next, Node previous, String value) {
			this.next = next;
			this.previous = previous;
			this.value = value;
		}
	}
	
	public static void main(String[] args){
		
		MyStringLinkedList linkedList = new MyStringLinkedList();
		linkedList.add("apple");
		linkedList.add("cat");
		linkedList.add("ball");
		
		while (linkedList.header != null) {
			System.out.println("---> " + linkedList.header.value);
			linkedList.header = linkedList.header.next;
		}
	}
}