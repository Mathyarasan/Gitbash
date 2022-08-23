package com.java2.co;

import java.util.Scanner;
public class Switch {

public static void main(String[] args) {
	
	
	for (int i = 1; i < 8 ; i++) {
		
		Scanner sw = new Scanner(System.in);
		
		System.out.println("Enter the number:");
	
		switch (i) {
		case 1:
			int num = sw.nextInt();
		System.out.println("Sunday");	
			break;
		case 2:
			int num2 = sw.nextInt();
			System.out.println("Monday");	
				break;
		case 3:
			int num3 = sw.nextInt();
			System.out.println("Tuesday");	
				break;
		case 4:
			int num4 = sw.nextInt();
			System.out.println("Wednesday");	
				break;
		case 5:
			int num5 = sw.nextInt();
			System.out.println("Thursday");	
				break;
		case 6:
			int num6 = sw.nextInt();
			System.out.println("Friday");	
				break;
		case 7:
			int num7 = sw.nextInt();
			System.out.println("Saturday");	
				break;

		default:
			int num8 = sw.nextInt();
			System.out.println("Invalid");
			break;
		}
	}
}
}
