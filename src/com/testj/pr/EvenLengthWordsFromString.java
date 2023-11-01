
package com.testj.pr;

public class EvenLengthWordsFromString {

	public static void main(String[] args) {
		String string = "This is a java language";

		String[] stringArray = string.split(" ");

		for (String stringVal : stringArray) {
			if (stringVal.length() % 2 == 0) {
				System.out.println(stringVal);
			}
		}
	}
}
