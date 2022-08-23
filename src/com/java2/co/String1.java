package com.java2.co;

public class String1 {
	
public static void main(String[] args) {
	
	String s="String is an object";
	int a = s.length();
	System.out.println(a);
	
	String s1="String is An object";
	boolean b = s.equals(s1);
	System.out.println(b);
	
	boolean c = s.equalsIgnoreCase(s1);
	System.out.println(c);
	
	String d = s.toUpperCase();
	System.out.println(d);
	
	String e = s.toLowerCase();
	System.out.println(e);
	
	boolean f = s.startsWith("String");
	System.out.println(f);
	
	boolean g = s.endsWith("Object");
	System.out.println(g);
	
	boolean h = s.contains("is an");
	System.out.println(h);
	
	int i = s.indexOf("i");
	System.out.println(i);
	
	int j = s.lastIndexOf("e");
	System.out.println(j);
	
	char k = s.charAt(7);
	System.out.println(k);
	
	String s2 = "String is an object";
	String l = s2.replace("String", "ball");
	System.out.println(l);
	
	String m = s.substring(13);
	System.out.println(m);
	
	String n = s.substring(0,10);
	System.out.println(n);
	
	boolean o = s.isEmpty();
	System.out.println(o);
	
	String s3 = "    String is     an object   ";
	String p = s3.trim();
	System.out.println(p);
	
	String q = s.concat(s1);
	System.out.println(q);
	
	int a2=144;
	String r = s.valueOf(a2);
	System.out.println(r+3);
	
	String[] t = s.split(" ");
	for (String str : t) {
		System.out.println(str);
		
		String s4="welcome to world";
		int u = s.compareTo(s4);
		System.out.println(u);
	}	
}
}
