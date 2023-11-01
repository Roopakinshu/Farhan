package com.javalearningspractice.dayone;

public class CountrySpecificRules implements CentralTrafficRules {

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Go");

	}

	@Override
	public void yellowWai() {
		// TODO Auto-generated method stub
		System.out.println("Ready");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Stop");
	}
	public void walk() {
		System.out.println("Walking");
	}

	public static void main(String[] args) {
		CountrySpecificRules countrySpecificRules = new CountrySpecificRules();
		countrySpecificRules.greenGo();
		countrySpecificRules.yellowWai();
		countrySpecificRules.redStop();
		countrySpecificRules.walk();
	}
}
