package com.javalearningspractice.dayone;

public class SortArray {
	public static void main(String[] args) {
		int[] a = { 9, 5, 7, 4, 3, 1, 6, 2, 8, 0 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}

//		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
//			s.add(a[i]);
		}
	}
}
