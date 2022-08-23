package com.java1.co;

public class Exception_Handle {

	public static void main(String[] args) {
		
		System.out.println(10/2);
		
		try {
			System.out.println(2/0);
		} catch (Exception e) {
			// TODO: handle exception
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("executed");
		}
		try {
			System.out.println(30/2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
