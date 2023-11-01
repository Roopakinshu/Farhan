package interviewquestion;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Asser {
//	WebDriver driver;

	public static void main(String[] args) {
		
		String string = "abacabacabacabacacabac";
		findDublicate(string);
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c: string.toCharArray() ) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
				System.out.println("c value "+c);
				System.out.println("map.get(c) value "+ map.get(c));
			}
			else {
				map.put(c, 1);
			}

		}
		System.out.println(map);
		
	}
	public static void findDublicate(String string) {
		Set<Character> set = new HashSet<Character>();
		
		char[] charArray = string.toCharArray();
		for(char e : charArray) {
			set.add(e);
		}
		System.out.println(set);
	}
	
	
}