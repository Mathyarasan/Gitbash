package com.prac.co;

public class Armstrong {

	public static void main(String[] args) {
		
		int n =153;
		int i,j=0;
		int a=n;
		
		while (a>0) {
			
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
		}
		if (n==j) {
			System.out.println("ARMSTRONG");
		} else {
			
			System.out.println("NOT ARMSTRONG");

		}
	}
}
