package com.test.code;

public class RemoveVowelsFromString {
	public static void main(String[] args) {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		String string = "Farhan";

		for (int i = 0; i < string.length(); i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (string.charAt(i) == vowels[j]) {
					break;
				} else {
					System.out.print(string.charAt(i));
					break;
				}
			}
		}

	}

}
