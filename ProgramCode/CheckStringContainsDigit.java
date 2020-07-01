package com.mock.test;

import java.util.ArrayList;

public class CheckStringContainsDigit {
	
	static String convertToBinary(char ch) {
		String binary = "";
		int digit = Integer.parseInt(String.valueOf(ch));
		while(digit > 0) {
			int rem = digit % 2;
			binary = rem + binary;
			digit = digit/2;
		}
		return binary;
	}
	static ArrayList<String> convertStringDigitToBinary(String str) {
		ArrayList<String> list = new ArrayList<String>();
		char[] arr = str.toCharArray();
		for(char c: arr) {
			if(c >= '0' && c <= '9') {
				String bin = convertToBinary(c);
				list.add(bin);
			}
			else
				continue;
		}
		return list;
	}
	public static void main(String[] args) {
		
		String str = "jay7CTS8";
		
		ArrayList<String> result = convertStringDigitToBinary(str);
		if(result.isEmpty())
			System.out.println("No Digit Found!");
		else
			System.out.println(result);
	}

}
