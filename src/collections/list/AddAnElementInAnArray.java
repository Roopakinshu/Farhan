package collections.list;

public class AddAnElementInAnArray {
	public static void main(String[] args) {
		int[] integerArray = { 1, 2, 4, 5, 7, 4, 6, 8, 9 };

		int[] intArray = new int[5];
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		for (int ar : integerArray) {
			System.out.println(ar);
		}
		for (int arr : intArray) {
			System.out.println(arr);
		}
	}
}
