package com.java1.co;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Method {

	public static void main(String[] args) {
		
		Map<Integer,String> a = new HashMap<Integer,String>();
		
		a.put(1, "Java");
		a.put(2, "code");
		a.put(2, "selenium");
		a.put(3, "list");
		a.put(4, "Set");
		a.put(5, "Map");
		
		System.out.println(a);
		
		int b = a.size();
		System.out.println(b);
		
		String str = a.get(2);
		System.out.println(str);
		
		boolean c = a.containsKey(4);
		System.out.println(c);
		
		boolean d = a.containsValue("collection");
		System.out.println(d);
		
		Set<Integer> set = a.keySet();
		System.out.println(set);
		
		Collection<String> values = a.values();
		System.out.println(values);
		
		Set<Entry<Integer, String>> set2 = a.entrySet();
		System.out.println(set2);
	}
}
