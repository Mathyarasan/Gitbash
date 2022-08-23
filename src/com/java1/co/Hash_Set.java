package com.java1.co;

import java.util.HashSet;
import java.util.Set;

public class Hash_Set {

    public static void main(String[] args) {
		
    	Set <Object> a = new HashSet <Object>();
    	Set <Object> b = new HashSet <Object>();
    	
    	a.add(23);
    	a.add("java");
    	a.add(true);
    	a.add(null);
    	a.add(2.6);
    	b.add(23);
    	b.add("code");
    	b.add(35);
    	b.add(2.8);
    	
    	int c = a.size();
    	System.out.println(c);
    	
    	boolean d = a.contains(23);
    	System.out.println(d);
    	
    	a.remove(2.6);
    	System.out.println(a);
    	
    	//a.retainAll(b);
    	//System.out.println(a);
    	
    	a.addAll(b);
    	System.out.println(a);
    	
    	a.removeAll(b);
    	System.out.println(a);
    	
    	a.clear();
    	System.out.println(a);
    	
	}
}
