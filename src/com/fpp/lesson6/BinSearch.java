package com.fpp.lesson6;

/**
 * This class contains to recursive method calls to find if given character is
 * in given string or not
 * 
 * @author suresh
 */
public class BinSearch {

	public static void main(String[] args) {

		//String with character in ascending order
		String s = "abcdefghij";
		char c = 'f';
		System.out.println(binarySearch(s, c));
	}

	/**
	 * 
	 * @param a
	 *            characters array formed from given string
	 * @param target
	 *            character to be checked
	 * @return boolean value based on recursive call return
	 */
	public static boolean binarySearch(String s, char target) {
		return search(s, 0, s.length() - 1, target);
	}

	/**
	 * 
	 * @param s
	 *            - array of characters
	 * @param start
	 *            - start index of substring
	 * @param end
	 *            - end index of substring
	 * @param target
	 *            - character to be checked
	 * @return true on condition match, false otherwise
	 */
	public static boolean search(String s, int start, int end, char target) {

		int m = (start + end) / 2;
		char ch = s.charAt(m);
		/**
		 * Termination point
		 */
		if (end < start) {
			return false;
		}
		/**
		 * Satisfying point
		 */
		if (target == ch) {
			return true;
		} else if (target < ch) {
			return search(s, start, m, target);
		} else {
			return search(s, m + 1, end, target);
		}
	}

}
