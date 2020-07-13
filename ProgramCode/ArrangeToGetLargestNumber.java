package com.mock.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrangeToGetLargestNumber {

	/*private class MyComparator implements Comparator<String> {
		@Override
		public int compare(String s1, String s2) {
			String s12 = s1 + s2;
			String s21 = s2 + s1;
			return s21.compareTo(s12);
		}
		
	}*/
	String findLargestNumber(int[] arr) {
		List<String> strList = Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.toList());
		
		//Collections.sort(strList, new MyComparator());
		//Using Java 8 concept
		Comparator<String> customCompare = (s1, s2) -> {  String x= s1 + s2;
														String y = s2 + s1; 
														return y.compareTo(x);};
		strList.sort(customCompare);
		String largestNum = "";
		Iterator<String> itr = strList.iterator();
		while(itr.hasNext()) {
			largestNum += itr.next();
		}
		return largestNum;
	}
	public static void main(String[] args) {
		int[] strArr = {9, 98, 2, 4, 5};
		
		ArrangeToGetLargestNumber arrangeObj = new ArrangeToGetLargestNumber();
		System.out.println("Largest number is: ");
		System.out.println(arrangeObj.findLargestNumber(strArr));
	}
	
}
