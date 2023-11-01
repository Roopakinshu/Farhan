package com.test.pr;

import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<Character> list = new ArrayList<Character>();
		list.add('a');
		list.add('b');
		list.add('e');
		list.add('c');
		list.add('i');
		list.add('j');
		

		
		for(char a: list) {
			if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u') {
				System.out.println(a);
			}
		}
	}
	
}
