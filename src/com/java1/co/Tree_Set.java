package com.java1.co;

import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {
public static void main(String[] args) {
		
    	Set <Object> a = new TreeSet <Object>();
    	Set <Object> b = new TreeSet <Object>();
    	
    	a.add(23);
    	a.add(34);
    	a.add(45);
    	a.add(21);
    	a.add(12);
    	b.add(23);
    	b.add(11);
    	b.add(9);
    	b.add(2);
    	
    	int c = a.size();
    	System.out.println(c);
    	
    	boolean d = a.contains(34);
    	System.out.println(d);
    	
    	a.remove(21);
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
