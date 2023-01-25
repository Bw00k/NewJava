package com.yedam.java.homework;

public class Human {
//	1) Human 클래스를 정의한다.
//	- 이름과 키, 몸무게를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//	- 메소드는 다음과 같이 정의한다.
//	(1) public void getInformation() : 이름, 키와 몸무게를 출력하는 기능
	// 필드
	String name; // 이름
	static double cm; // 키
	double kg; // 몸무게

	// 생성자
	public Human() {} //기본 생성자
	public Human(String name, int cm, int kg) { // 생성자 초기화
		this.name = name;
		this.cm = cm;
		this.kg = kg;
	}

	// 메소드
	public void getInformation() { // 정보 출력하기
		System.out.print(name + "님의 신장 " + cm + ", 몸무게 " + kg);
	}
	
}
