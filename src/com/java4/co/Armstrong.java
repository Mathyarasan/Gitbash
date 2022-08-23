package com.java4.co;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number : ");
		
		int num = sc.nextInt();
		int len = String.valueOf(num).length();
		int temp=num;
		double output=0;
		
		while (num>0) {
			
			int rem = num%10;
			output=output+Math.pow(rem, len);
			num=num/10;
		}
		if (temp==output) {
			System.out.println("armstrong number");
		}else {
			System.out.println("not an armstrong number");
		}
	}
}
