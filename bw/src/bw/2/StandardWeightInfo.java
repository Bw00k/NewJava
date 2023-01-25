package com.yedam.java.homework;

public class StandardWeightInfo extends Human {
//	2) StandardWeightInfo 클래스를 정의한다.
//	- Human 클래스를 상속한다.
//	- 메소드는 다음과 같이 정의한다.
//	(1) public void getInformation() : 이름, 키, 몸무게와 표준체중을 출력하는 기능
//	(2) public double getStandardWeight() : 표준체중을 구하는 기능
//	( * 표준 체중 : (Height - 100) * 0.9 )
	//필드
	static double avgKg;
	//생성자
	public StandardWeightInfo() {} //기본 생성자
	public StandardWeightInfo(String name, int cm, int kg) { // 생성자 초기화
		super(name,cm,kg);
	}
	
	//메소드
	public void getInformation() {
		System.out.print(name + "님의 신장 " + cm + ", 몸무게 " + kg +", 표준체중 " + getStandardWeight());
		
	}
	public static double getStandardWeight() {
		avgKg = (cm - 100) * 0.9;
		return avgKg;
	}
}
