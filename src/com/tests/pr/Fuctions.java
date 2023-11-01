package com.tests.pr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Fuctions {
	
	
	
	public static void main(String[] args) {
//		String string1
//		compareSrtings()
		Set<String> set = new HashSet<String>();
		set.add("gvhju");
		set.add("gvhjy");
		set.add("gvhjt");
		set.add("gvhje");
		set.add("gvhjs");
		set.add("gvhjd");
		
		List<String> list = new ArrayList<String>(set);
		for(String el : list) {
			System.out.println(el);
		}
		
	}
	public static boolean compareStrings(String string1, String string2) {
		if(string1.equals(string2)) {
			return true;
		}
		return false;
	}
	
	
	
	

}
