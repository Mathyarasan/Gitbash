package com.prac.co;

public class Meth2obj {

	public void call(int a) {
		
		System.out.println(a);
}
	
	public static void main(String[] args) {
		
		Meth2obj cc =new Meth2obj();
		cc.call(17);
	}
}