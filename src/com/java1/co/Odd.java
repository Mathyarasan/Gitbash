package com.java1.co;

public class Odd {
	static int sum=0 , count=0;

	public static void main(String[] args) {
		
		for (int i = 0; i < 25; i++) {
			
			if (i%2!=0) {
				
				System.out.println(i +" ");
				
				sum = sum+i;
				count =count +1;
				
				}
		}
		System.out.println("\nsum of odd no.s :"+sum);
		System.out.println("count:"+count);
 }
}
