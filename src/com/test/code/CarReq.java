package com.test.code;

public class CarReq implements Car{

	public static void main(String[] args) {
		CarReq carReq = new CarReq();
		carReq.carName();
		carReq.carColor();
	}

	@Override
	public void carName() {
		// TODO Auto-generated method stub
		System.out.println("BMW");
		
	}

	@Override
	public void carColor() {
		// TODO Auto-generated method stub
		System.out.println("Black");
	}
}
