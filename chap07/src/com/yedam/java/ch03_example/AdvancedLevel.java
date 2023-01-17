package com.yedam.java.ch03_example;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("빠르게 달립니다.");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("높이 점프합니다.");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("턴을 할 수 없습니다.");
	}

	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub
		System.out.println("**** 중급자 레벨입니다. ****");
	}

}
