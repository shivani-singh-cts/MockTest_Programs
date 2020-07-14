package com.mock.test;

public class PangramStringChecking {

	static boolean checkPangram(String str) {
		if(str.length() < 26)
			return false;
		str = str.toLowerCase();
		for(char c = 'a'; c <= 'z'; c++) {
			if(str.indexOf(c) == -1)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		boolean result = checkPangram(str);
		if(result == true)
			System.out.println("String is Pangram.");
		else
			System.out.println("String is not pangram.");
	}

}
