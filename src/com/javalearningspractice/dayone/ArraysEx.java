package com.javalearningspractice.dayone;

import java.util.Arrays;

public class ArraysEx {
	public static void main(String[] args) {
		/*
		 * Array is declared with a fixed size; Declarinng Array for integers int[]
		 * integerArray = new int[10]; Declaring Array for char char[] charArray = new
		 * char[5];
		 * 
		 */

//		In this below step we are allocating the memory and then initializing the values
		int[] integerArray = new int[5];
		integerArray[1] = 1;
		integerArray[2] = 2;
		integerArray[3] = 3;
		integerArray[4] = 4;
		integerArray[0] = 5;
		for (int i = 0; i < integerArray.length; i++)
			System.out.print(integerArray[i]+" ");

		System.out.println();
//		Array Literal example:
		int[] b = { 5, 6, 7, 8, 9 };

		for (int i = 0; i < integerArray.length; i++)
			System.out.print(b[i]+" ");
		Arrays.sort(integerArray);

	}
}
