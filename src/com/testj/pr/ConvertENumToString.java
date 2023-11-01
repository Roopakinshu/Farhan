package com.testj.pr;

enum Fruit {
	Orange, Mango, Banana, Grapes, Promoganate
}

public class ConvertENumToString {
	public static void main(String[] args) {
		System.out.println(Fruit.Orange.name());
		System.out.println(Fruit.Mango.name());
		System.out.println(Fruit.Grapes.name());
		System.out.println(Fruit.Banana.name());
		System.out.println(Fruit.Promoganate.name());
		String anam = Fruit.Promoganate.name();
	}
}
