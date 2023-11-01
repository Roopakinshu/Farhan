import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class CreateTreeSetFromList {

	public static void main(String[] args) {

		List<Character> char_List = new ArrayList<Character>();
		char_List.add('b');
		char_List.add('d');
		char_List.add('c');
		char_List.add('a');
		System.out.println(char_List);
		TreeSet<Character> treeSet = new TreeSet<Character>();
		treeSet.addAll(char_List);
		System.out.println(treeSet);
		
		List<Integer> integer_List = new ArrayList<Integer>();
		integer_List.add(4);
		integer_List.add(2);
		integer_List.add(1);
		integer_List.add(3);
		System.out.println(integer_List);
		TreeSet<Integer> integer_treeSet = new TreeSet<Integer>();
		integer_treeSet.addAll(integer_List);
		System.out.println(integer_treeSet);
		
//		or
		TreeSet<Integer> inter_treeSet = new TreeSet<Integer>(integer_List);
		System.out.println(inter_treeSet);
	}
}
