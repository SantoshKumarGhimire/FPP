package com.fpp.assignment6.qn1;

public class MyTable {
	private final int BALANCING_INDEX = 97;
	private Entry[] entries = new Entry[26];

	// returns the String that is matched with char c in the table
	public String get(char c) {
		for (Entry entry : entries) {
			if(entry != null && entry.entryChar == c){
				return entry.entryString;
			}
		}
		return "Given character '"+c+"' doesn't have any match !!";
	}

	// adds to the table a pair (c, s) so that s can be looked up using c
	public void add(char c, String s) {
		
		char lowerCaseChar = Character.toLowerCase(c);
		int index = (int)lowerCaseChar - BALANCING_INDEX;
		Entry entry = new Entry(s, lowerCaseChar);
		entries[index] = entry;
	}

	// returns a String consisting of nicely formatted display
	// of the contents of the table
	public String toString() {
		
		StringBuffer sb = new StringBuffer();
		for (Entry entry : entries) {
			if (entry != null) {
				sb.append(entry + "\n");
			}
		}
		return sb.toString();
	}

	private class Entry {

		private String entryString;
		private char entryChar;

		Entry(String str, char ch) {
			this.entryString = str;
			this.entryChar = ch;
		}

		// returns a String of the form "ch->str"
		public String toString() {
			return entryChar + " -> " + entryString;
		}
	}

	public static void main(String[] args) {
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b', "Billy");
		t.add('w', "Willie");
		System.out.println(t);

	}

}