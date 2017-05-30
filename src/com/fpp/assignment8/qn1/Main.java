package com.fpp.assignment8.qn1;

/**
 * 
 * @author suresh
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStringList myList = new MyStringList();
		myList.add("big");
		myList.add("small");
		myList.add("tall");
		myList.add("short");
		myList.add("round");
		myList.add("square");
		myList.add("emormous");
		myList.add("tiny");
		myList.add("gargantuan");
		myList.add("lilliputian");
		myList.add("numberless");
		myList.add("none");
		myList.add("vast");
		myList.add("miniscule");
		
		myList.sort();
		
		System.out.println(myList.toString());
		System.out.println(myList.search("number"));
		System.out.println(myList.search("tiny"));
	}

}
