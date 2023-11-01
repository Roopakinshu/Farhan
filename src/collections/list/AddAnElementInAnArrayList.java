package collections.list;

import java.util.ArrayList;

public class AddAnElementInAnArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
		integerArrayList.add(1);
		integerArrayList.add(2);
		integerArrayList.add(3);
		integerArrayList.add(1,4);

//		printing an arrayList
		System.out.println(integerArrayList);

//		Printing an individual element present in an ArrayList
		for (int e : integerArrayList) {
			System.out.println(e);
		}

		ArrayList<String> stringArrayList = new ArrayList<String>();
		stringArrayList.add("Name");
		stringArrayList.add("name2");
		stringArrayList.add("name3");
		System.out.println(stringArrayList);

		ArrayList<Character> characterArrayList = new ArrayList<Character>();
		characterArrayList.add('A');
		characterArrayList.add('B');
		characterArrayList.add('C');

		System.out.println(characterArrayList);
	}
}
