package com.prac.co;

import java.util.ArrayList;
import java.util.List;

public class Array_2_List {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		Integer []arr= new  Integer[list.size()];
		list.toArray(arr);
		for (Integer integer : arr) {
			System.out.println(integer);
		}
		
		
	}
}
