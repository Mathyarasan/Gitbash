package com.java1.co;

public class Prime_Number {

	public static void main(String[] args) {
		
		int a=29;
		boolean b=false;
		for (int i = 2; i < a/2; ++i) {
			if (a%2==0) {
				b=true;
				break;
			}
		}
		if (!b) {
			System.out.println(a+"is a prime no.");
		}
		else {
			System.out.println(a+"is not a prime no.");
		}
	}
}
