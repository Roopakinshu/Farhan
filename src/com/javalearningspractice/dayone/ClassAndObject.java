package com.javalearningspractice.dayone;
// Can can have a variables, methods and main methods
//methods are created outside the main method and in side the class
// all the reusable code will be written in methods
// if the variable are declared in class level are known as global variables 
// and the variable declared in method level are known as local variables

// Objects are instances/ references of the class, we can call the methods of class using this references
// 
public class ClassAndObject {

//	class level variable
	int a  =10;
	
//	method
	public void print(String s) {
		System.out.println(s);
	}
	
//	main method
	public static void main(String[] args) {
//		local variable
		String name = "abc";
		
		ClassAndObject classAndObject = new ClassAndObject();
		
		System.out.println(classAndObject.a);
		classAndObject.print(name);
	}
}
