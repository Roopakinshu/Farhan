package com.test.code;

import java.util.Random;

public class GenerateARandoMString {

	public static void main(String[] args) {
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String newString ="";
		int length = letters.length();
		int requiredLenght = 5;
		Random random = new Random();
		for(int i=0; i<requiredLenght; i++) {
		int num = random.nextInt(letters.length());
		char randomChar = letters.charAt(num);
		
		newString = newString+randomChar;
		}
		System.out.println(newString);
	}
}
