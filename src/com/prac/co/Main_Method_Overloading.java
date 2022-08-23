package com.prac.co;

public class Main_Method_Overloading {

	public static void main(String[] x) throws Exception {
		
		int[] a = {1,2,3};
		
		main(a);
}

	private static void main(int[] x) throws Exception{
		
		System.out.println("main method overloading");
		
		System.out.println(x[0]);
		
		System.out.println(x[1]);

		System.out.println(x[2]);

	}
}
