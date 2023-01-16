package com.yedam.java.ch01_01;

public class SportsCar extends Car{

	@Override
	public void speedUp() {
		speed += 10;
		// TODO Auto-generated method stub
		super.speedUp();
	}

	public void carStop() {
		super.stop();
	
	}
}
