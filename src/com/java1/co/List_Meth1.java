package com.java1.co;

import java.util.ArrayList;
import java.util.List;

public class List_Meth1 {

	public static void main(String[] args) {
		List <Object> a = new ArrayList <Object> ();
		List <Object> a1 = new ArrayList <Object> ();
		a.add(25);
		a.add(2.4);
		a.add("java");
		a.add(false);
		a1.add(28);
		a1.add(2.6);
		a1.add("code");
		a1.add(true);
		System.out.println(a);
		
		int b = a.size();
		System.out.println(b);
		
		Object c = a.get(2);
		System.out.println(c);
		
		a.set(2, "code");
		System.out.println(a);
		
		a.remove(1);
		System.out.println(a);
		
		int d = a.indexOf(25);
		System.out.println(d);
		
		boolean e = a.contains(false);
		System.out.println(e);
		
		//a.retainAll(a1);
		//System.out.println(a);
		
		a.addAll(a1);
		System.out.println(a);
		
		a.removeAll(a1);
		System.out.println(a);
		
		a.clear();
		System.out.println(a);
		
	}
}
