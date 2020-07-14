package com.mock.test;

public class InitialsOfName {

	static String getInitialsOfName(String name) {
		String initials = "";
		if(name.length() == 0)
			return initials;
		
		//String[] strArr = name.split(" ");
		String[] strArr = name.split("\\s+");
		for(int i = 0; i< strArr.length; i++){
			initials += Character.toString(strArr[i].charAt(0)).toUpperCase(); 
			initials += " ";
		}
		return initials.trim();
	}
	public static void main(String[] args) {
		String name = "Shivani Singh";
		System.out.println("Name: " + name);
		System.out.println("Initials: " + getInitialsOfName(name));
	}

}
