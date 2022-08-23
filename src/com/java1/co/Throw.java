package com.java1.co;

public class Throw {

	public static void main(String[] args) throws Exception {
		
		for (int i = 0; i < 16; i++) {
			
			if (i==10) {
				
				throw new Exception();
				
			}
			System.out.println(i);
			
		}
	}
}
