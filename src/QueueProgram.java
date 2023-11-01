import java.util.LinkedList;
import java.util.Queue;

public class QueueProgram {

	public static void main(String[] args) {

		Queue<String> que_List = new LinkedList<String>();
		que_List.add("apple");
		que_List.add("doll");
		que_List.add("ball");
		que_List.add("cat");		
		
		System.out.println(que_List);
		
		System.out.println(que_List.contains("apple"));
		
		que_List.peek();
		System.out.println(que_List.peek());
		
		System.out.println( que_List.poll());
		System.out.println(que_List);
		
		que_List.remove();
		System.out.println(que_List);
		
		que_List.clear();
		System.out.println(que_List);
	}
}
