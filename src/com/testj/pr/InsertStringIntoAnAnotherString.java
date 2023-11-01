package com.testj.pr;

public class InsertStringIntoAnAnotherString {

	public static void main(String[] args) {
		String string = "GeeksGeeks";
		String toBeInsert = "For";
		int index = 4;

		String newString = "";
		for (int i = 0; i < string.length(); i++) {
			newString = newString + string.charAt(i);
			if (i == index) {
				newString = newString + toBeInsert;

			}
		}
		System.out.println(newString);
	}
}
