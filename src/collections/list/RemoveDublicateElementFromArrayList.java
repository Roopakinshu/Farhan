package collections.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDublicateElementFromArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
		integerArrayList.add(1);
		integerArrayList.add(2);
		integerArrayList.add(3);
		integerArrayList.add(4);
		integerArrayList.add(5);
		integerArrayList.add(2);
		integerArrayList.add(4);
		integerArrayList.add(3);
		integerArrayList.add(4);
		integerArrayList.add(5);
		integerArrayList.add(2);
		integerArrayList.add(4);
		integerArrayList.add(3);
		integerArrayList.add(4);
		integerArrayList.add(5);
		integerArrayList.add(2);
		integerArrayList.add(8);
		System.out.println(integerArrayList);

//		Remove duplicate elements using iterator
		ArrayList<Integer> arrayList = removeDublicateElementsUsingIterator(integerArrayList);
		System.out.println("removing duplicate elements using iteraor " + arrayList);

//		Removing duplicate elements using set
		ArrayList<Integer> set = removeDublicateElementsUsingSet(integerArrayList);
		System.out.println("removing duplicate elements using set " + set);

//		Removing duplicate elements using streams
		List<Integer> streamArrayList = integerArrayList.stream().distinct().collect(Collectors.toList());
		System.out.println("removing duplicate elements using streams " + streamArrayList);

		
	}

	public static ArrayList<Integer> removeDublicateElementsUsingIterator(ArrayList<Integer> integerArrayList) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int e : integerArrayList) {
			if (!arrayList.contains(e)) {
				arrayList.add(e);
			}
		}
		return arrayList;
	}

	public static ArrayList<Integer> removeDublicateElementsUsingSet(ArrayList<Integer> integerArrayList) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int e : integerArrayList) {
			set.add(e);
		}
		ArrayList<Integer> arrayList = new ArrayList<Integer>(set);

		return arrayList;
	}

}
