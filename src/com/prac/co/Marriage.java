package com.prac.co;

public class Marriage extends Boy{

	@Override
	public void girlname() {
		// TODO Auto-generated method stub
		super.girlname();
	System.out.println("worked properly");
	}

	public static void main(String[] args) {
		
	Marriage m = new Marriage();
	m.girlname();
	}
}
