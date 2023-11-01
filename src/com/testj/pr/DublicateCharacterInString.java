package com.testj.pr;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DublicateCharacterInString {

	public static void main(String[] args) {
		String string = "farhan is my name";
		HashMap<Character, Integer> map = findDublicateUsingDataStructre(string);
		
		for(Map.Entry<Character, Integer> ae: map.entrySet()) {
			if(ae.getValue()>1) {
				System.out.println(ae.getKey()+ " "+ ae.getValue());
			}
		}

	}

	public static void dublicate(String string) {
		char[] charArray = string.toCharArray();
		int lengthOfString = string.length();
		Set<Character> set = new HashSet<Character>();

		for (int i = 0; i < lengthOfString - 1; i++) {
			for (int j = 0; j < lengthOfString; j++) {
				if (charArray[i] == charArray[j] && i != j) {
					set.add(charArray[i]);
				}
			}
		}
		System.out.println(set);
	}

	public static HashMap<Character, Integer> findDublicateUsingDataStructre(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] a = s.toCharArray();

		for (char ae : a) {
			if (map.containsKey(ae)) {
				map.put(ae, map.get(ae) + 1);
			} else {
				map.put(ae, 1);
			}
		}
		return (HashMap<Character, Integer>) map;
	}
}
