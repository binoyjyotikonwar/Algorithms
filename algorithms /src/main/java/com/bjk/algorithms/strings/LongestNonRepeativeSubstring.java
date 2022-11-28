package com.bjk.algorithms.strings;

import java.util.HashMap;

public class LongestNonRepeativeSubstring {
	public static void main(String args[]) {
		LongestNonRepeativeSubstring aLongest = new LongestNonRepeativeSubstring();
		System.out.println(LongestNonRepeativeSubstring.lengthOfLongestSubstring("aabcdefeffff"));
	}

	public static int lengthOfLongestSubstring(String s) {
		int max = 0, start = 0, i = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		while (i < s.length()) {
			char temp = s.charAt(i);

			// adding key to map if not present
			if (!map.containsKey(temp)) {
				map.put(temp, 0);
				System.out.println(temp+ "---" +  map.get(temp));
//				System.out.println(map.get(temp));
			// Check if the first value is the duplicate value
			}else if (s.charAt(start) == temp)
				start++;
			// Check if the previous value is duplicate value
			else if (s.charAt(i - 1) == temp) {
				if (max < map.size())
					max = map.size();
				map = new HashMap<>();
				start = i;
				i--;
			}
			// last possible place where duplicate value in between start and i
			else {
				if (max < map.size())
					max = map.size();
				while (s.charAt(start) != temp) {
					map.remove(s.charAt(start));
					start++;
				}
				start++;
			}
			i++;

		}
		if (max < map.size())
			max = map.size();
		return max;

	}
}
