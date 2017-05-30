package com.fpp.lesson6;

/**
 * This class contains to recursive method calls to find if given character is
 * in given string or not, additionally we had sorted string on our own
 * 
 * @author suresh
 */
public class BinSearchV2 {

	public static void main(String[] args) {

		// String with character in ascending order
		String s = "dbcaaxk";
		char c = 'x';
		String sortedString = stringSort(s);
		System.out.println("Sorted String: "+sortedString);
		System.out.println(binarySearch(sortedString, c));
	}

	/**
	 * 
	 * @param a
	 *            characters array formed from given string
	 * @param target
	 *            character to be checked
	 * @return boolean value based on recursive call return
	 */
	public static boolean binarySearch(String a, char target) {
		return search(a, 0, a.length() - 1, target);
	}

	/**
	 * 
	 * @param string
	 *            - array of characters
	 * @param start
	 *            - start index of substring
	 * @param end
	 *            - end index of substring
	 * @param target
	 *            - character to be checked
	 * @return true on condition match, false otherwise
	 */
	public static boolean search(String string, int start, int end, char target) {

		int m = (start + end) / 2;
		char ch = string.charAt(m);
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
			return search(string, start, m, target);
		} else {
			return search(string, m + 1, end, target);
		}
	}

	/**
	 * 
	 * Method to arrange string char in ascending order
	 * @param s unsorted atring
	 * @return sorted string 
	 */
	public static String stringSort(String s) {
	    if (s.length() < 2) {
	        return s;
	    }

	    int pos = 0;
	    char min = s.charAt(0);
	    for(int i = 1; i < s.length(); i++) {
	        char c = s.charAt(i);
	        if (c < min) {
	            min = c;
	            pos = i;
	        }
	    }
	    return Character.toString(min) + stringSort(s.substring(0, pos) + s.substring(pos + 1));
	}

}
