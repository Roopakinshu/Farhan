package collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveAnElementFromAnArrayList {
	public static void main(String[] args) {
		 ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
		    integerArrayList.add(1);
		    integerArrayList.add(2);
		    integerArrayList.add(4);
		    integerArrayList.add(8);
		    integerArrayList.add(5);
		    integerArrayList.add(6);

		System.out.println("original Array "+integerArrayList);
		integerArrayList.remove(3);
		System.out.println("After removing an element from an arrayList "+ integerArrayList);
		integerArrayList.remove(2);
		System.out.println("After removing an element from an arrayList "+ integerArrayList);
		
		Iterator it = integerArrayList.iterator();
		while(it.hasNext()) {
			int n = (int) it.next();
			if(n>=2)
			it.remove();{
				
			}
		}
		System.out.println(integerArrayList);
	}

}
