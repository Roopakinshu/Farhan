package com.test.code;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumNumberOfWordsFounds {
	public static void main(String[] args) {
		String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int count = 0;
		for(String en: sentences) {
			String[] arry = en.split(" ");
			arr.add(arry.length);
			
		}
		Collections.sort(arr);
		int size = arr.size();
		
		System.out.println(arr.get(size-1));
	}
}
