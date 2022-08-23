package com.java1.co;

public class Continue {
public static void main(String[] args) {
	for (int i = 0; i < 26; i++) {
		if (i>10 && i<20) {
			continue;
		}
		System.out.println(i);
	}
}
}
