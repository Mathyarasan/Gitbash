package com.java4.co;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter The word : ");
		
		String next = sc.next();
		
		int len = next.length();
		
		String b="";
		
		for (int i = len-1; i >=0; i--) {
			
			b=b+ next.charAt(i);
		
		}
		System.out.println("Original Word : "+next);
		System.out.println("Reverse Word : "+b);
		
	}
}
