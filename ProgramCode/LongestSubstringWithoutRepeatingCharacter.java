package com.mock.test;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacter {

	static int findLongestSubstringLength(String str) {
		int maxLen =0;
		int i = 0, j =0;
		int n = str.length();
		HashSet<Character> set = new HashSet<>();
		while(i < n && j < n) {
			if(!set.contains(str.charAt(j))) {
				set.add(str.charAt(j++));
				maxLen = Math.max(maxLen, j-i);
			}
			else {
				set.remove(str.charAt(i++));
			}	
		}
		return maxLen;
	}
	public static void main(String[] args) {
		String str = "shivani";
		int len = findLongestSubstringLength(str);
		System.out.println("Length of longest substring without repeating character is: " + len);

	}

}
