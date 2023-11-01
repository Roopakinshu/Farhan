package collections.list;

import java.util.ArrayList;

public class UpdateAnElementInAnArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
		integerArrayList.add(1);
		integerArrayList.add(2);
		integerArrayList.add(3);
		integerArrayList.add(3);
		integerArrayList.add(5);
		integerArrayList.add(6);
		integerArrayList.add(7);

		System.out.println(integerArrayList);

		// updating an element
		integerArrayList.set(3, 4);
		System.out.println(integerArrayList);

		ArrayList<String> stringArrayList = new ArrayList<String>();
		stringArrayList.add("Name1");
		stringArrayList.add("Name2");
		stringArrayList.add("Name3");
		stringArrayList.add("Name5");
		stringArrayList.add("Name5");
		System.out.println(stringArrayList);
		stringArrayList.set(3, "Name4");
		System.out.println(stringArrayList);
	}
}
