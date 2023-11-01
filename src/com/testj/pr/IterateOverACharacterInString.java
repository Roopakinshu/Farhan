package com.testj.pr;

import java.util.LinkedList;
import java.util.List;

public class IterateOverACharacterInString {

	public static void main(String[] args) {
		String string = "GreatWork";

		List<Character> ch = new LinkedList<Character>();
		char[] arr = string.toCharArray();
		for (char ar : arr) {
			System.out.print(ar+" ");
			ch.add(ar);
		}
		System.out.println(ch);
	}
}
