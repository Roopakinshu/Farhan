import java.nio.file.spi.FileSystemProvider;
import java.util.TreeSet;

public class RemoveDuplicateElementsFromTreeSet {

	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(1); treeSet.add(3);
		treeSet.add(2); treeSet.add(7); treeSet.add(5);
		treeSet.add(4); treeSet.add(6); treeSet.add(1); treeSet.add(3); treeSet.add(4);
		treeSet.add(6); treeSet.add(1);
		treeSet.add(3); treeSet.add(2); treeSet.add(7); treeSet.add(5); treeSet.add(4); treeSet.add(6); treeSet.add(1);
		treeSet.add(3);	treeSet.add(4);treeSet.add(6);
		
		
		System.out.println(treeSet);
		
		String[] input
        = new String[] { "Hello",   "hi",     "Wow",
                         "cute",    "thanks", "hi",
                         "Aww",     "cute",   "baby",
                         "beloved", "Aww" };
		
		TreeSet<String> string_treeSet = new TreeSet<String>();
		for(String e: input) {
			string_treeSet.add(e);
		}
		
		System.out.println(string_treeSet);
	}

}
