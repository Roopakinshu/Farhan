package com.test.pr;

public class Dub {

	public static void main(String[] args) {
		String string = "farhan";
		String dublicate = "";

		for(int i=0; i<string.length(); i++) {
			int count =1;
			for(int j=1; j<string.length(); j++) {
				if(!(string.charAt(i)==string.charAt(j) && i!=j)) {
					count++;
				}
			}
			if(count>1) {
				System.out.print(string.charAt(i) +" "+ count);
				break;
			}
		}
	}
}
