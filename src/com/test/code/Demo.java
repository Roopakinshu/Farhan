package com.test.code;

import java.util.HashSet;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		String s = "afzgyidlujkdrhytkgjm";
		reverse(s);
		unique(s);
		dublicate(s);
	}

	public static void reverse(String s) {
		String reverse = "";
		for (int i = 0; i < s.length(); i++) {
			reverse = s.charAt(i) + reverse;

		}
		System.out.println(reverse);
	}

	public static void unique(String s) {
		Set<Character> s1 = new HashSet<Character>();
		for (char c : s.toCharArray()) {
			s1.add(c);
		}
		for (char e : s1) {
			System.out.print(e);
		}
	}

	public static void dublicate(String s) {
		String aba = "";
		Set<Character> sq = new HashSet<Character>();
		char[] sa = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			for (int j = 1; j < s.length(); j++) {
				if (sa[i] == sa[j] && i!=j) {
					break;
				} else {
					sq.add(sa[i]);
				}
			}
		}
		System.out.println(sq);
	}
}
