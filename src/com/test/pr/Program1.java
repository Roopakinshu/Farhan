package com.test.pr;

public class Program1 {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c = 7;
		System.out.println(Program1.sum(a, b));
		System.out.println(toLowerCase("FARHAN"));
	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static String toLowerCase(String str) {
		return str.toLowerCase();
	}

}
