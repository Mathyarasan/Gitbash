package com.prac.co;

public class Reverse_Number {

	public static void main(String[] args) {
		
		int n=212;
		int i,j=0;
		int a=n;
		while (a>0) {
			
			i=a%10;
			j=j*10+i;;
			a=a/10;
			
		}
		System.out.println("reverse number:"+j);
		if (n==j) {
			System.out.println("palindrome");
		} else {
           System.out.println("not palindrome");
		}
	}
}
