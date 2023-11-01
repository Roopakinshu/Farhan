package com.test.code;

public class ReplaceDigitWithCharacter {
	public String replaceDigits(String s) {
		String newString = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				char character = s.charAt(i - 1);
				int previousCharacterValue = (int) character;
				int charavterValueToFound = previousCharacterValue + Character.getNumericValue(s.charAt(i));
				char characterFound = (char) charavterValueToFound;
				newString = newString + characterFound;
			} else {
				newString = newString + s.charAt(i);
			}

		}

		return newString;
	}

	public static void main(String[] args) {
		String s = "a1b2c3d4e";
		ReplaceDigitWithCharacter replaceDigitWithCharacter = new ReplaceDigitWithCharacter();

		System.out.println(replaceDigitWithCharacter.replaceDigits(s));
	}

}
