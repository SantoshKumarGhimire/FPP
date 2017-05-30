package com.fpp.assignment7.qn0;

/**
 * 
 * @author suresh
 *
 */
public class AccountList {

	int ARRAY_SIZE = 10;
	public Account[] strArray = new Account[ARRAY_SIZE];;
	int indexlength = 0;

	public void add(Account s) {
		if (indexlength >= strArray.length)
			resize();
		strArray[indexlength] = s;
		indexlength++;
	}

	public Account get(int i) {
		if (i < 0 || i >= indexlength)
			return null;
		return strArray[i];
	}

	public int size() {
		return indexlength;
	}

	public boolean find(String s) {
		for (int i = 0; i < indexlength + 1; i++) {
			if (strArray[i].equals(s)) {
				return true;
			}
		}
		return false;
	}

	public boolean remove(String s) {

		Account[] temp = new Account[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].equals(s)) {
				System.arraycopy(strArray, 0, temp, i - 1, i - 1);
				System.arraycopy(strArray, i + 1, temp, i + 1,
						strArray.length - 1);
			} else
				return false;
		}

		strArray = temp;
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}

		return true;
	}

	public void resize() {
		Account[] temp = new Account[2 * strArray.length];
		System.arraycopy(strArray, 0, temp, 0, strArray.length);
		strArray = temp;
	}

}
