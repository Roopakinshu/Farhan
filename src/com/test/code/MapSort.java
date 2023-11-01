package com.test.code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSort {
	public static void main(String[] args) throws Exception {
//		Map<Integer, String> map = createMap();
//		System.out.println(map);
//		LinkedHashMap<Integer, String> sortedMapBasedOnKeys = sortMapBasedOnKeys(map);
//		System.out.println(sortedMapBasedOnKeys);
//		LinkedHashMap<Integer, String> sortMapBasedOnValues = sortMapBasedOnValues(map);
//		System.out.println(sortMapBasedOnValues);
		
		String s = "my name is farhan";
		String[] arr = s.split(" ");
		
		List<String> list = Arrays.asList(arr);
		
		List<String> sorted = list.stream().sorted((e1,e2)->e1.compareTo(e2)).collect(Collectors.toList());
		System.out.println(sorted);
		
		
	}
	
	public static Map<Integer, String> createMap() {
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(2, "n4");
		map.put(5, "n2");
		map.put(7, "n7");
	

		return map;
	}
	public static LinkedHashMap<Integer, String> sortMapBasedOnKeys(Map<Integer, String> map) {
		LinkedHashMap<Integer, String> sorted = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(
				Map.Entry::getKey,
				Map.Entry::getValue,
				(oldKey, newKey)->oldKey, LinkedHashMap::new));
		return sorted;
	}
	public static LinkedHashMap<Integer, String> sortMapBasedOnValues(Map<Integer, String> map){
		LinkedHashMap<Integer, String> sorted = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(
				Map.Entry::getKey,
				Map.Entry::getValue,
				(oldValue, newValue)->oldValue, LinkedHashMap::new));
		return sorted;
	}

	

}
