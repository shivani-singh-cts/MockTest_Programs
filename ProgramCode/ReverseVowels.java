package com.mock.test;

public class ReverseVowels {

	static boolean isVowel(char c) {
		if(c == 'a'|| c == 'e'|| c == 'i'|| c =='o'||c=='u' || c == 'A'|| c == 'E'|| c == 'I'|| c =='O'||c=='U')
			return true;
		else
			return false;
	}
	static String reverseVowels(String str) {
		if(str.length() == 0) 
			return "";
		
		int i=0;
		int j = str.length() -1;
		char[] arr = str.toCharArray();
		while(i< j) {
			if(!isVowel(arr[i])) {
				i++;
				continue;
			}
			if(!isVowel(arr[j])) {
				j--;
				continue;
			}
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return new String(arr);
	}
	public static void main(String[] args) {
		String str = "hello";
		System.out.println("String with Reversed Vowels: " + reverseVowels(str));
	}

}
