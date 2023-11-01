package javaday2;

public class Goldmansachh {
	

		public static void main(String[] args) {
//			Find out the first non-repeating character from the given array of String.
//			Ex:
//				Input : { "array", "apple", "rat"}
//				Output: y,a,r

			String[] string_array = { "array", "apple", "rat" };

//			for (String string : string_array) {
//				int index = -1;
//				char nonRepeatingCharacter = ' ';
//				for (char c : string.toCharArray()) {
//					if (string.indexOf(c) == string.lastIndexOf(c)) {
//						nonRepeatingCharacter = c;
//						break;
//					} else {
//						index += 1;
//					}
//				}
//				if (!(index == string.length() - 1)) {
//					System.out.print(nonRepeatingCharacter+", ");
	//
//				}

//			}

			for (String string : string_array) {
				for (int i = 0; i < string.length(); i++) {
					int count = 1;
					for (int j = 0; j < string.length(); j++) {
						if (string.charAt(i) == string.charAt(j) && i != j) {
							count++;
						}
					}
					if (count == 1) {
						System.out.print(string.charAt(i) + ", ");
						break;
					}
				}
			}
		}
	}



