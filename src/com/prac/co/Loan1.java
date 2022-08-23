package com.prac.co;

public class Loan1 extends Loan{

	@Override
	public void eduloan() {
		System.out.println("9%");
		
	}
	public static void main(String[] args) {
		Loan1 l =new Loan1();
		l.eduloan();
		l.personalloan();
		l.homeloan();
	}
}

