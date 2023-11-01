package collections.list;

import java.util.LinkedHashSet;

public class UnionOfSetInLInkedHashSet {

	public static void main(String[] args) {

		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("string1");
		lhs.add("string2");
		lhs.add("string3");
		lhs.add("string4");
		lhs.add("string5");
		System.out.println(lhs);

		LinkedHashSet<String> another_lhs = new LinkedHashSet<String>();
		another_lhs.add("another_String1");
		another_lhs.add("another_String2");
		another_lhs.add("another_String3");
		another_lhs.add("another_String4");
		System.out.println(another_lhs);

		lhs.addAll(another_lhs);

		System.out.println(lhs);

	}
}
