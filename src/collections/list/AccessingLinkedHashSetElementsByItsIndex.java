package collections.list;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class AccessingLinkedHashSetElementsByItsIndex {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("string 1");
		lhs.add("string 2");
		lhs.add("string 3");
		lhs.add("string 4");
		
		System.out.println(lhs);
		
		Iterator it = lhs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(String e: lhs) {
			System.out.println(e);
		}
		
		lhs.forEach(e->System.out.println(e));
		
	}
}
