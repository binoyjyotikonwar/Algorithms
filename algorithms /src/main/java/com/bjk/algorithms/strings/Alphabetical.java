package com.bjk.algorithms.strings;

/**
 * Alphabetical order is a system whereby character strings are placed in order
 * based on the position of the characters in the conventional ordering of an
 * alphabet. Wikipedia: https://en.wikipedia.org/wiki/Alphabetical_order
 */
public class Alphabetical {
	public static void main(String[] args) {
		Alphabetical aAlphabetical = new Alphabetical();
//		assert !isAlphabetical("123abc");
//		assert isAlphabetical("aBC");
//		assert isAlphabetical("abc");
//		assert !isAlphabetical("xyzabc");
//		assert isAlphabetical("abcxyz");
	}

	public static boolean isAlphabetical(String s) {
		s = s.toLowerCase();
		for (int i = 0; i < s.length() - 1; ++i) {

			if (!Character.isLetter(s.charAt(i)) || !(s.charAt(i) <= s.charAt(i + 1))) {

				return false;

			}

		}

		return true;

	}
}
