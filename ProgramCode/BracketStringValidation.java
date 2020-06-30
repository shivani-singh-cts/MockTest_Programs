package com.mock.test;

import java.util.Stack;

public class BracketStringValidation {

	static boolean isStringValid(String str) {
		if(str != null) {
			if(str.trim().length() == 0)
				return true;
			else {
				Stack<Character> stack = new Stack<>();
				char[] arr = str.toCharArray();
			
				for(int i = 0; i< arr.length; i++) {
					if(arr[i] == '(' || arr[i] =='{' || arr[i] =='[')
						stack.push(arr[i]);
					if(arr[i] == ')' || arr[i] =='}' || arr[i] ==']') {
						if(stack.isEmpty())
							return false;
						char temp = stack.pop();
						if((temp == '(' && arr[i] == ')') || (temp == '{' && arr[i] == '}') || (temp == '[' && arr[i] == ']'))
							continue;
						else
							return false;
					}
				}
				if(!stack.isEmpty())
					return false;
				else
					return true;
			}
		}
		else
			return false;
	}
	public static void main(String[] args) {
		String input = "()[]{}";
		boolean result = isStringValid(input);
		if(result)
			System.out.println("Input string is VALID.");
		else
			System.out.println("Input string is INVALID");
	}

}
