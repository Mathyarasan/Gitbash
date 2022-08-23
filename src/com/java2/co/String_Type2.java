package com.java2.co;

public class String_Type2 {
public static void main(String[] args) {
	
	StringBuffer a= new StringBuffer("Code");
	StringBuffer b= new StringBuffer("Java");
	a=a.append(b);
	
	System.out.println(System.identityHashCode(a));
	System.out.println(System.identityHashCode(b));
	
	StringBuffer rev = a.reverse();
	System.out.println(rev);
}
}
