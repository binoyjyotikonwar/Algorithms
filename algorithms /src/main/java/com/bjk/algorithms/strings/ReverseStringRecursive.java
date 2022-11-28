package com.bjk.algorithms.strings;

public class ReverseStringRecursive {
	public static void main(String args[]) {
		System.out.println(ReverseStringRecursive.reverse("asdfgh"));
	}
	/**
     * @param str string to be reversed
     * @return reversed string
     */
	
	public static String reverse(String str) {
		if(str.isEmpty()) {
			return str;
		}else {
			System.out.println(reverse(str.substring(1)));
			return reverse(str.substring(1)) + str.charAt(0);
		}
	}
}
