package com.prac.co;

public class Int2str_Str2int {

	public static void main(String[] args) {
		
		String s ="123445455";
		
		int parseInt = Integer.parseInt(s);
		
		System.out.println(parseInt);
		
		String valueOf1 = String.valueOf(parseInt);
		
		System.out.println(valueOf1);
		
		Integer valueOf2 = Integer.valueOf(valueOf1);
		
		System.out.println(valueOf2);
	}
}
