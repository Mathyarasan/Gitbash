package com.java1.co;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		
		for (int i = 0; i < 7; i++) {
			
		Scanner sc = new Scanner(System.in);
			
		int year = sc.nextInt();
		

		if (year%4==0) {
			
			System.out.println(year+"is a leap year");
		}
		
		else {
			
			System.out.println(year+"is not a leap year");
		}
			
		}
	}
}
