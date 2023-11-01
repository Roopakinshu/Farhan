package com.test.code;

public class SortingTheSentences {
	public static void main(String[] args) {
		String s = "Myself2 Me1 I4 and3";
		String sortedSentences = sortingTheSentences(s);
		System.out.println(sortedSentences);
	}

	public static String sortingTheSentences(String string) {

		String[] gsa = string.split(" ");

		String newString = "";

		int count = 1;
		for (int j = 0; j < gsa.length; j++) {
			for (int i = 0; i < gsa.length; i++) {
				if (gsa[i].contains(String.valueOf(count))) {

					String a = gsa[i].substring(0, gsa[i].length() - 1);
					newString = newString + " " + a;
					count++;
				}
			}

		}
		return newString.trim();
	}
}
