package com.java1.co;

public class Employer {
public Employer() {
	// TODO Auto-generated constructor stub
	System.out.println("Default Connstructor");
}
public Employer(int a, int b) {
	// TODO Auto-generated constructor stub
	System.out.println(a+b);
}
public static void main(String[] args) {
	Employer obj=new Employer();
	Employer obj1=new Employer(34,45);
}
}
