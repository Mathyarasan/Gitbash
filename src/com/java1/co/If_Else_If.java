package com.java1.co;

import java.util.Scanner;

public class If_Else_If {
  public static void main(String[] args) {
	System.out.println("Enter The Time:");
	Scanner tm = new Scanner(System.in);
	int time = tm.nextInt();
	 if (time<6) {
		System.out.println("Midnight");
	}else if(time >=6&& time<=12) {
		System.out.println("Morning");
	}else if (time>12 && time<=16) {
		System.out.println("Afternoon");
	} else if (time>16 && time<=20) {
		System.out.println("Evening");
	} else if (time>20 && time<=24) {
		System.out.println("Night");
	} else {
		System.out.println("Invalid");
	}
}
}
