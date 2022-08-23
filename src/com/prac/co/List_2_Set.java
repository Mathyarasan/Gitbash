package com.prac.co;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.java1.co.Hash_Set;

public class List_2_Set {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("a");
		list.add("b");
		System.out.println(list);
		
		Set<String> set = new HashSet<String>(list);
		
		System.out.println(set);
	}
}
