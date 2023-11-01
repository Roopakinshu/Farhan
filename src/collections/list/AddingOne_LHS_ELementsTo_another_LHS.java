package collections.list;

import java.util.LinkedHashSet;

public class AddingOne_LHS_ELementsTo_another_LHS {

	public static void main(String[] args) {

		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("a");
		lhs.add("b");
		lhs.add("c");

		LinkedHashSet<String> another_lhs = new LinkedHashSet<String>();
		another_lhs.add("another_a");
		another_lhs.add("another_b");
		another_lhs.add("another_c");

		for (String e : lhs) {
			another_lhs.add(e);
		}
		System.out.println(another_lhs);
	}
}
