package collections.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Difference_HS_LHS_TreeSet {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		TreeSet<Integer> ts = new TreeSet<Integer>();

		hs.add(91);
		hs.add(4);
		hs.add(76);
		hs.add(1);
		hs.add(98);
		hs.add(30);

		lhs.add(91);
		lhs.add(4);
		lhs.add(76);
		lhs.add(1);
		lhs.add(98);
		lhs.add(30);

		ts.add(91);
		ts.add(4);
		ts.add(76);
		ts.add(11);
		ts.add(98);
		ts.add(30);
		ts.add(1);
		Iterator<Integer> it = ts.descendingIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(hs);
		System.out.println(lhs);
		System.out.println(ts);

		HashSet<String> string_hs = new HashSet<String>();
		string_hs.add("string_hs1");
		string_hs.add("string_hs2");
		string_hs.add("string_hs3");
		string_hs.add("string_hs4");
		string_hs.add("string_hs5");
		string_hs.add("string_hs6");

		LinkedHashSet<String> string_lhs = new LinkedHashSet<String>();
		string_lhs.add("string_hs1");
		string_lhs.add("string_hs2");
		string_lhs.add("string_hs3");
		string_lhs.add("string_hs4");
		string_lhs.add("string_hs5");
		string_lhs.add("string_hs6");
		
		TreeSet<String> string_ts = new TreeSet<String>();
		string_ts.add("string_hs1");
		string_ts.add("string_hs2");
		string_ts.add("string_hs3");
		string_ts.add("string_hs4");
		string_ts.add("string_hs5");
		string_ts.add("string_hs6");
		
		System.out.println(string_hs);
		System.out.println(string_lhs);
		System.out.println(string_ts);
		
	}
}
