package com.java4.co;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class It_List {

	public static void main(String[] args) {
		
		List<Object> a = new ArrayList<Object>();
		
		a.add(28);
		a.add("string");
		a.add(true);
		a.add(2.7);
		
		System.out.println(a);
		
		Iterator<Object> it = a.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());	
		}
		
		System.out.println("-----------------------------------");
		ListIterator<Object> li = a.listIterator();
		while (li.hasNext()) {
	    System.out.println(li.next());
		}
		 System.out.println("------------------------");
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
	}
}
