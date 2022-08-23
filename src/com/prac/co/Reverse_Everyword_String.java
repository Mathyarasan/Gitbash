package com.prac.co;

public class Reverse_Everyword_String {

	public static void main(String[] args) {
		
		String s="Welcome To World";
		
		String reverseSentence ="";
		
		String[] allwords = s.split(" ");
		
		for (String word : allwords) {
			 
			String reverse ="";
			
			for (int i=word.length()-1; i>=0 ; i--) {
				
				char ch =word.charAt(i);
				
				reverse=reverse+ch;
			}
			reverseSentence=reverseSentence+reverse+" ";
		}
		System.out.println(reverseSentence);
	}
}
