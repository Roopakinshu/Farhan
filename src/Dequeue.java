import java.util.Deque;
import java.util.LinkedList;

public class Dequeue {

	public static void main(String[] args) {

		Deque<String> deque_String = new LinkedList<String>();
		deque_String.add("abc");
		deque_String.add("dcd");
		deque_String.add("cde");
		deque_String.add("def");
		deque_String.add("efg");
		
		System.out.println(deque_String);
		
		deque_String.addFirst("adfadc");
		System.out.println(deque_String);
		
		deque_String.addLast("adcasda");
		System.out.println(deque_String);
		
	}
}
