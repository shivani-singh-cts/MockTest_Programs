package com.mock.test;

import java.util.HashMap;

public class MinWindowOfSHavingT {

	static String findMinWindow(String s, String t) {
		if(s.length() < t.length() || s.length() == 0 || t.length() == 0)
			return "";
	
		String result = "";
		HashMap<Character, Integer> tMap = new HashMap<>();
		for(int i =0;i< t.length(); i++) {
			int count = tMap.getOrDefault(t.charAt(i), 0);
			tMap.put(t.charAt(i), count+1);
		}
		
		int required = tMap.size();
		int begin =0, end =0;
		int formed = 0;
		
		int minLen = -1;
		int begIndex =0, endIndex = 0;
		HashMap<Character, Integer> window = new HashMap<>();
		while(end < s.length()) {
			char c = s.charAt(end);
			int count = window.getOrDefault(c, 0);
			window.put(c, count+1);
			
			if(tMap.containsKey(c) && window.get(c).intValue() == tMap.get(c).intValue())
				formed++;
			
			while(begin < end && formed == required) {
				c = s.charAt(begin);
				if(minLen == -1 || end -begin+1 < minLen) {
					minLen = end -begin + 1;
					begIndex = begin;
					endIndex = end;
				}
				
				window.put(c, window.get(c) -1);
				if(tMap.containsKey(c) && window.get(c).intValue() < tMap.get(c).intValue())
					formed--;
				begin++;
			}
			end++;
		}
		if(minLen == -1)
			return result;
		result = s.substring(begIndex, endIndex + 1);
		return result;
	}
	public static void main(String[] args) {
		String s = "ADOBECODEBANC";
		String t = "ABC";
		String result = findMinWindow(s, t);
		if(result.length() != 0)
			System.out.println("Minimum Window having all characters of T is : " + result);
		else
			System.out.println("No such window exists!");
	}

}
