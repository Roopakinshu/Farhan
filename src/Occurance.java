import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Occurance {

	public static void main(String[] args) {
		int[] array = { 1, 13, 4, 1, 41, 31, 31, 4, 13, 2, 69,69,69 };
//		System.out.println(array);
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int arr : array) {
			arrayList.add(arr);
		}
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int arrayListValue : arrayList) {
			if(!map.containsKey(arrayListValue)) {
				map.put(arrayListValue, 1);
			} else {
				map.put(arrayListValue, map.get(arrayListValue)+1);
			}
		}
		for(Map.Entry<Integer, Integer> e: map.entrySet()) {
			System.out.println(e);
		}
		
		TreeMap<Integer, Integer> map_t = new TreeMap<Integer, Integer>(map);
		System.out.println(map_t);
		
	}
}
