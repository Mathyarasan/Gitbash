package com.java1.co;

import java.util.Scanner;

public class Scanner_Calculation {
	
public static void main(String[] args) {
	Scanner no = new Scanner (System.in);
	System.out.println("Enter Add NO.1:");
	System.out.println("Enter Add N0.2:");
	int no1 = no.nextInt();
	int no2 = no.nextInt();
	System.out.println(no1 + no2);
	System.out.println("Enter Sub NO.1:");
	System.out.println("Enter Sub N0.2:");
	int no3 = no.nextInt();
	int no4 = no.nextInt();
	System.out.println(no3 - no4);
	System.out.println("Enter Mul NO.1:");
	System.out.println("Enter Mul N0.2:");
	int no5 = no.nextInt();
	int no6 = no.nextInt();
	System.out.println(no5 * no6);
	System.out.println("Enter Div NO.1:");
	System.out.println("Enter Div N0.2:");
	int no7 = no.nextInt();
	int no8 = no.nextInt();
	System.out.println(no7 / no8);
}
}
