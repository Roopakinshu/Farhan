package com.test.code;

public class CheckIfTwoStringArraysAreEqual {
	public static void main(String[] args) {
		String[] word1 = { "ab", "c" };
		String[] word2 = { "a", "cb" };
		CheckIfTwoStringArraysAreEqual solution = new CheckIfTwoStringArraysAreEqual();

		boolean result = solution.arrayStringsAreEqual(word1, word2);
		if (result) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		String newString = "";
		String newString1 = "";
		boolean flag = false;
		for (int i = 0; i < word1.length; i++) {
			newString = newString + word1[i];
		}
		for (int i = 0; i < word2.length; i++) {
			newString1 = newString1 + word2[i];
		}
		if (newString.equals(newString1)) {
			flag = true;
		}
		return flag;
	}
}