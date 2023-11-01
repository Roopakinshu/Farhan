package com.javalearningspractice.dayone;

public class FindMaxNumberFromMultidimensionArray {
	public static void main(String[] args) {
		int[][] b = { { 9, 5, 6, }, { 7, 4, 6 }, { 7, 3, 11 } };
		int num = b[0][0];

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (b[i][j] > num) {
					num = b[i][j];
				} else {
//					break;
				}
			}
		}
		System.out.println(num);
	}


}
