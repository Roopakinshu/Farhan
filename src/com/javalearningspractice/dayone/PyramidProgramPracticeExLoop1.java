package com.javalearningspractice.dayone;

public class PyramidProgramPracticeExLoop1 {

	public static void main(String[] args) {

		assignment();
		System.out.println();
		int count = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count);
				count++;
			}
			System.out.println();
		}
		count = count - 1;
		for (int i = 4; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(count);
				count--;
			}
			System.out.println();

		}

	}

	/*
	 * outPut: 3 6 9 12 15 18
	 */
	public static void assignment() {
		int count = 3;
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count);
				count = count+3;
			}
			System.out.println();
		}
	}
}
