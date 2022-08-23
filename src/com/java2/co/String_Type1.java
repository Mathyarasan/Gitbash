package com.java2.co;

public class String_Type1 {
public static void main(String[] args) {
	String a="Code";
	String b="Java";
	a=a+b;
	System.out.println(System.identityHashCode(a));
	System.out.println(System.identityHashCode(b));
}
}
