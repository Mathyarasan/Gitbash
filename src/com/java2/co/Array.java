package com.java2.co;

public class Array {
public static void main(String[] args) {
	int arr[][] = new int[2][2];
	arr[0][0] = 2;
	arr[0][1] =3;
	arr[1][0]=4;
	arr[1][1]=5;
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
}
