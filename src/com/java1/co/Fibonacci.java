package com.java1.co;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a=1,b=2,c=0;
		System.out.print("1 2");
		
		while (c<100) {
			
		c= a+b;
		a=b;
		b=c;
		System.out.print(c+" ");
		}
	}
}
