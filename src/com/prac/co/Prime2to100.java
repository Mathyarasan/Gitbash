package com.prac.co;

public class Prime2to100 {

	public static void main(String[] args) {
		
		int d=0;
		
		for (int n = 2; n <= 100; n++) {
			
			int c=0;
		
			
			for (int i = 2; i < n; i++) {
				
				 if (n%i == 0) {
					
					 c++;
					 break;
				}
			}
			if (c == 0) {
				d++;
				System.out.println(n);
				
			}
		}
		
		System.out.println("total no. of prime no. from 2 to 100:" +d);
	}
}
