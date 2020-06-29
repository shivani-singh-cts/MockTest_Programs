package com.mock.test;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfString {

	List<String> result = new ArrayList<String>();
	List<String> getPermutations(String str, int start, int end) {
		if(start == end)
			//System.out.println(str);
			result.add(str);
		else {
			for(int i = start; i<= end; i++) {
				str = swap(str, start, i);
				getPermutations(str, start+1, end);
				str = swap(str, start, i);
			}
		}
		return result;
	}
	
	String swap(String str, int i, int j) {
		char temp;
		char[] charArray = str.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		
		return String.valueOf(charArray);
	}
	public static void main(String[] args) {
		PermutationsOfString permutation = new PermutationsOfString();
		
		String str = "ABC";
		int n = str.length();
		System.out.println("Permutations of String " + str +" are: ");
		System.out.println(permutation.getPermutations(str, 0, n-1));
	}

}
