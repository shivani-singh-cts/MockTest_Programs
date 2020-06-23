package com.mock.test;

import java.util.Optional;

public class ReverseString {
	//Reverse String without affecting special Character
	static Optional<String> reverse(String str) {
		if(str != null) {
			char[] input = str.toCharArray(); 
			int i = 0, j = str.length() -1;
			while(i< j) {
				if(!Character.isAlphabetic(input[i]))
					i++;
				else if(!Character.isAlphabetic(input[j]))
					j--;
				else {
					char temp = input[i];
					input[i] = input[j];
					input[j] = temp;
					i++;
					j--;
				}
			}
			return Optional.of(new String(input));
		}
		return Optional.empty();
	}
	public static void main(String[] args) {
		String input = "ab@c";
		Optional<String> result = reverse(input);
		System.out.println("Reversed String is: "+ result.map(String::valueOf).orElse("Null Input"));
	}

}
