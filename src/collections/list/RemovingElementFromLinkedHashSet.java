package collections.list;

import java.util.LinkedHashSet;

public class RemovingElementFromLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("string1");
		lhs.add("string2");
		lhs.add("string3");
		lhs.add("string4");
		System.out.println(lhs);
		
		lhs.remove("string3");
		System.out.println(lhs);
		
		lhs.clear();
		System.out.println(lhs);
	}
}
