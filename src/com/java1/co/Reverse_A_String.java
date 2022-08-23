package com.java1.co;

public class Reverse_A_String {

		public static void main (String[] args) {
		
			String str ="world", nstr="";
			char ch ;
			System.out.print("Original word:");
			System.out.println("world");
			
			for (int i = 0; i < str.length(); i++) {
				
				ch = str.charAt(i);
				nstr=ch+nstr;
				
			}
			System.out.println("reverse word:"+nstr);
			


}
}