package com.testj.pr;

public class ConvertStringToStringArray {
	public static void main(String[] args) {
		String string = "Geeks for Geeks";

		String[] stringArray = string.split(" ");

		for (String strArr : stringArray) {
			System.out.println(strArr);
		}
	}

}
