package javaday2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeClass {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("name1");
		list.add("name2");
		list.add("name3");
		list.add("name4");

		list.stream().filter(e -> e.contains("name1")).forEach(e -> {
			if (e.equals("name1"))
				;
			System.out.println(e);
		});
		// reverse a string
		String string = "farhan";
		String reverseString = "";
		for (char c : string.toCharArray()) {
			reverseString = c + reverseString;
		}
		System.out.println(reverseString);

//	Finding unique character from string
		String stringWithChar = "eclipseworkspace";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char e : stringWithChar.toCharArray()) {
			if (map.containsKey(e)) {
				map.put(e, map.get(e) + 1);
			} else {
				map.put(e, 1);
			}
		}
		System.out.println(map.size());

		for (Map.Entry<Character, Integer> e : map.entrySet()) {
			if (e.getValue() == 1) {
				System.out.print(e.getKey() + " ");
			}
		}
		System.out.println();

		// sorting the map
		LinkedHashMap<Character, Integer> sortedMap = map.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldKey, newKey) -> oldKey,
						LinkedHashMap::new));
		System.out.println("*** " + sortedMap);
		System.out.println();
//		Finding dublicate Character from string
		String stringWithChar1 = "eclipseworkspace";

		Map<Character, Integer> map1 = new HashMap<Character, Integer>();

		for (char e : stringWithChar1.toCharArray()) {
			if (map1.containsKey(e)) {
				map1.put(e, map.get(e) + 1);
			} else {
				map1.put(e, 1);
			}
		}

		for (Map.Entry<Character, Integer> e : map1.entrySet()) {
			if (e.getValue() >= 2) {
				System.out.print(e.getKey() + " ");
			}
		}
		System.out.println();

//		Finding dublicate words from string
		String s1 = "my name is yaparla mohd farhan and i will be as farhan";
		String[] stringArray = s1.split(" ");

		Map<String, Integer> wordsMap = new HashMap<String, Integer>();

		for (String e : stringArray) {
			if (wordsMap.containsKey(e)) {
				wordsMap.put(e, wordsMap.get(e) + 1);
			} else {
				wordsMap.put(e, 1);
			}
		}
		for (Map.Entry<String, Integer> e : wordsMap.entrySet()) {
			if (e.getValue() >= 2) {
				System.out.print(e.getKey() + " ");
			}
		}
	}
}
