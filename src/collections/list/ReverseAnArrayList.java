package collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseAnArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
		integerArrayList.add(5);
		integerArrayList.add(4);
		integerArrayList.add(3);
		integerArrayList.add(2);
		integerArrayList.add(1);
		integerArrayList.add(0);
		System.out.println(integerArrayList);

		ArrayList<String> stringArrayList = new ArrayList<String>();
		stringArrayList.add("my");
		stringArrayList.add("name");
		stringArrayList.add("is");
		stringArrayList.add("xyz");
		ArrayList<String> newStringArrayList = new ArrayList<String>();

		for (int i = stringArrayList.size() - 1; i >= 0; i--) {
			newStringArrayList.add(stringArrayList.get(i));
		}
		System.out.println(newStringArrayList);

		System.out.println(reverseAnArrayUsingIterator(integerArrayList));

		System.out.println(reverseAnArrayUsingSwap(integerArrayList));

		System.out.println(reverseArrayListUsingCollectionMethod(integerArrayList));
	}

	public static ArrayList<Integer> reverseAnArrayUsingIterator(ArrayList<Integer> arrayList) {
		ArrayList<Integer> newArrayList = new ArrayList<Integer>();
		for (int i = arrayList.size() - 1; i >= 0; i--) {
			newArrayList.add(arrayList.get(i));
		}

		return newArrayList;
	}

	public static ArrayList<Integer> reverseAnArrayUsingSwap(ArrayList<Integer> arrayList) {
//		ArrayList<Integer> newArrayList = new ArrayList<Integer>();
		for (int i = 0; i < arrayList.size() / 2; i++) {
//			int arraySize = arrayList.size()-1;
			int a = arrayList.get(i);
			int b = arrayList.get(arrayList.size() - i - 1);
			arrayList.set(i, b);
			arrayList.set(arrayList.size() - i - 1, a);
		}

		return arrayList;
	}

	public static ArrayList<Integer> reverseArrayListUsingCollectionMethod(ArrayList<Integer> arrayList) {
//		ArrayList<Integer> a = new ArrayList<Integer>();
		Collections.reverse(arrayList);
		return arrayList;
	}

}
