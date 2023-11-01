package com.test.pr;

import java.util.HashSet;
import java.util.Set;

public class Program3 {

	public static void main(String[] args) {
		String x = "abc.xyz@gmail.com";
		splitString(x);
		reverseAString(x);
		findDublicate(x);
		findUnique(x);
		String a = " java geeks manual java test api java api geeks geek";
		findDublicateWord(a);
		findDublicateCharFromString(x);

	}

	public static void splitString(String st) {
		String[] a = st.split("@");
		String as = a[0];
		String[] b = as.split("[.]");
		System.out.println(b[1] + " " + b[0]);
	}

	public static void reverseAString(String st) {
		String strTemp = "";
		int st_length = st.length();
		for (int i = 0; i < st_length; i++) {
			strTemp = st.charAt(i) + strTemp;
		}

		System.out.println(strTemp);
	}

	public static void findDublicate(String st) {
		int count = 1;
		int am = 0;
		int length = st.length();
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (st.charAt(i) == st.charAt(j)) {
					count++;
				}
			}
			if (count > 1) {
				if (am == 1) {
					System.out.println(st.charAt(i) + " " + count);
					break;

				}
				am++;
				count = 1;

			} else {

			}

		}
	}

	public static void findUnique(String st) {
		int count = 1;
		int am = 0;
		int length = st.length();
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (st.charAt(i) == st.charAt(j)) {
					count++;
				}
			}
			if (count > 1) {
				if (am == 1) {
					System.out.println(st.charAt(i) + " " + count);
					break;

				}
				am++;
				count = 1;

			} else {
				if (am == 1) {
					System.out.println(st.charAt(i) + " " + count);
					break;

				}
				am++;
				count = 1;

			}

		}
	}

	public static void findDublicateWord(String st) {
		String[] a = st.split(" ");

		Set<String> stru = new HashSet<String>();

		int count = 1;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 1; j < a.length; j++) {
				if (a[i].equals(a[j]) && i != j) {
					stru.add(a[i]);
				}

			}
		}
		System.out.println(stru);
	}
	
	public static void findDublicateCharFromString(String st) {
		char[] a = st.toCharArray();
		
		Set<Character> set = new HashSet<Character>();
		
		for(int i=0; i<a.length-1; i++) {
			for(int j=1; j<a.length; j++) {
				if(a[i]==(a[j])&& i!=j) {
					set.add(a[i]);
				}
			}
		}
		System.out.println(set);
		
	}
}
