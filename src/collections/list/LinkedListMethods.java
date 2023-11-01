package collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Spliterator;

public class LinkedListMethods {
	public static void main(String[] args) {
		// Adding elements in a linkedList
		LinkedList<String> l_List = new LinkedList<String>();
		l_List.add("string1");
		l_List.add("string2");
		l_List.add("string3");
		l_List.add("string4");
		System.out.println(l_List);

		l_List.add(2, "string");
		System.out.println(l_List);

		LinkedList<String> l_List1 = new LinkedList<String>();
		l_List1.add("1");
		l_List1.add("2");
		l_List1.add("3");
		l_List1.add("4");
		l_List1.add("5");
		System.out.println(l_List1);

		l_List.addAll(l_List1);
		System.out.println(l_List);

		l_List.addAll(2, l_List1);
		System.out.println(l_List);

		l_List.addFirst("First String");
		System.out.println(l_List);

		l_List.addLast("Last String");
		System.out.println(l_List);

		l_List.clear();
		System.out.println(l_List);

		l_List1.clone();
		System.out.println(l_List1);

		System.out.println(l_List1.contains("2"));

		LinkedList<String> l_List2 = new LinkedList<String>();
		l_List2.add("string1");
		l_List2.add("string2");
		l_List2.add("string3");
		l_List2.add("string4");
		Iterator it = l_List2.descendingIterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();

		System.out.println(l_List2.element());
//		System.out.println(l_List2);

		for (int i = 0; i < l_List2.size(); i++) {
			System.out.println(l_List2.get(i));
		}

		System.out.println();
		System.out.println(l_List2.getFirst() + " " + l_List2.getLast());
		System.out.println();
		System.out.println(l_List2.indexOf("string3"));
		l_List2.add("string3");
		l_List2.add(5, "string3");
		l_List2.add("string5");
		l_List2.add(7, "string3");
		l_List2.add("string7");
		System.out.println(l_List2);
		System.out.println(l_List2.lastIndexOf("string3"));

		Iterator it1 = l_List2.listIterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

		ListIterator it2 = l_List2.listIterator(2);
		while (it2.hasNext()) {
			System.out.println("* " + it2.next());
		}

		l_List2.offer("string10");
		System.out.println(l_List2);
		l_List2.offerFirst("Offer First");
		System.out.println(l_List2);

		l_List2.offerLast("Offer Last");
		System.out.println(l_List2);

		l_List2.peek();
		System.out.println(l_List2.peek());
		System.out.println(l_List2.peekFirst());
		System.out.println(l_List2.peekLast());

		System.out.println("*** poll " + l_List2.poll());
		System.out.println(l_List2);
		l_List2.pollFirst();
		System.out.println(l_List2);
		l_List2.pollLast();
		System.out.println(l_List2);
		
		l_List2.pop();
		System.out.println("pop *** "+l_List2);
		l_List2.pop();
		System.out.println("pop *** "+l_List2);
		
		l_List2.push("String 2");
		System.out.println(l_List2);
		System.out.println(l_List1);
		System.out.println(l_List1.remove());
		System.out.println(l_List1);
		l_List1.remove(2);
		System.out.println(l_List1);
		System.out.println(l_List2);
		l_List2.remove("string4");
		System.out.println(l_List2);
		l_List2.removeFirst();
		System.out.println(l_List2);
		l_List2.removeLast();
		System.out.println(l_List2);
		l_List2.removeLastOccurrence("string3");
		System.out.println(l_List2);
		l_List2.set(2, "set new string");
		System.out.println(l_List2);
		System.out.println(l_List2.size());
		Spliterator sp = l_List2.spliterator();
			
		sp.forEachRemaining(value -> System.out.print(value+" "));
		System.out.println();
		
		l_List2.toArray();
		System.out.println(l_List2);
		
		l_List2.toString();
		System.out.println(l_List1);
		System.out.println(l_List1.toString());
	}

}
