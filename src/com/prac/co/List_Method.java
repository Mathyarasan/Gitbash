package com.prac.co;

import java.util.ArrayList;
import java.util.List;

public class List_Method {

	public static void main(String[] args) {
		
		List<Object> a = new ArrayList<Object>();
		
		List<Object> a1 = new ArrayList<Object>();
		
		a.add(23);
		a.add("obj");
		a.add(true);
		
		a1.add(2);
		a1.add("ob");
		a1.add(false);
		
		System.out.println(a);
		
		System.out.println(a1);
		
		int size = a.size();
		System.out.println(size);
		
		Object object = a.get(1);
		System.out.println(object);
		
		 a.set(0, "mathy");
		System.out.println(a);
		
		 a.remove(2);
		System.out.println(a);
		
		int indexOf = a1.indexOf(2);
		System.out.println(indexOf);
		
		boolean contains = a.contains("obj");
		System.out.println(contains);
		
		a.addAll(a1);
		System.out.println(a);
		
		//a.retainAll(a1);
		//System.out.println(a);
		
		a.removeAll(a1);
		System.out.println(a);
		
		a.clear();
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
