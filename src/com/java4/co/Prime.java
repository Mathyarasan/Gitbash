package com.java4.co;

import java.util.Scanner;

public class Prime {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The Number : ");
	
	int num = sc.nextInt();
	
	boolean isprime = true ;
	
	for (int i = 2; i < num; i++) {
		
		if (num%2==0) {
			isprime = false;
			break;
		}
		
	}
	if (isprime) {
		System.out.println("Prime Number : "+num);
	}else {
		System.out.println("Not A Prime Number : "+num);
	}
}
}
