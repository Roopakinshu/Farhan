package com.javalearningspractice.dayone;

public class MuntiDimensionArrayExe {
	public static void main(String[] args) {
		int[][] b = { { 9, 5, 6, }, { 7, 2, 0 }, { 7, 3, 11 } };

		int minNumber = b[0][0];
		int rowOfMinimumNumber = 0;
		int columnOfMinimumNumber = 0;
		int maxNum = 0;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (b[i][j] < minNumber) {
					minNumber = b[i][j];
					rowOfMinimumNumber = i;
					columnOfMinimumNumber = j;

				}
			}
		}

		
		System.out.println(maxNum+" "+rowOfMinimumNumber+" "+columnOfMinimumNumber);
		for(int i=0; i<b.length; i++) {
			if(b[i][columnOfMinimumNumber]>maxNum) {
				maxNum = b[i][columnOfMinimumNumber];
			}
		}
		System.out.println(maxNum);
	}

}
