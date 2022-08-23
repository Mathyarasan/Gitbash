package com.prac.co;

import java.util.List;
import java.util.Arrays;

public class Array2_List {

	public static void main(String[] args) {
		
		String arr[] = new String[3];
		
		arr[0]= "mathy";
		arr[1]="arasan";
		arr[2]="123";		
		
		for (String i : arr) {
			System.out.println(i);
		}
		
		
		List<String> con =  Arrays.asList(arr);
		
		System.out.println(con);
	}
}
