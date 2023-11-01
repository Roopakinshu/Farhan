package com.javalearningspractice.dayone;

public class MultiDimensionArray {
	public static void main(String[] args) {
		int[][] a = new int[2][3];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("****");
		int[][] b= {{3,5,6,},{7,4,6}};
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j <= b.length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}
}
