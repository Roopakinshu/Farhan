package com.test.code;

import java.util.Random;

public class ReverseStringAndPrintItRandomLy {
	public static void main(String[] args) {
		String string = "farhan";
		String reversedString = reverseString(string);
		System.out.println(reversedString);
		System.out.println(generateRandomString(reversedString));
	}

	public static String reverseString(String string) {
		String reversedString = "";
		int length = string.length();
		for (int i = 0; i < length; i++) {
			reversedString = string.charAt(i) + reversedString;
		}
		return reversedString;
	}

	public static String generateRandomString(String string) {
		String randomGeneratedString = "";

		Random random = new Random();
		for (int i = 0; i < string.length(); i++) {
			int number = random.nextInt(string.length());
			char character = string.charAt(number);
			randomGeneratedString = character + randomGeneratedString;
		}
		return randomGeneratedString;
	}
}
