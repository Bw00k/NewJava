package com.yedam.java.homework;

public class Employee {

	//	1) Employee 클래스를 정의한다.
	//	- 이름과 연봉을 필드로 가지며 생성자를 이용하여 값을 초기화한다.
	//	- 각 필드의 getter만 존재한다.
	//	- 메소드는 다음과 같이 정의한다.
	//	(1) public void getInformation() : 이름과 연봉을 출력하는 기능
	//	(2) public void print() : "수퍼클래스"란 문구를 출력하는 기능
	//필드
	private String name;
	private int pay;
	
	//생성자
	public Employee() {} // 기본생성자
	public Employee(String name, int pay) { //값 받아 초기화
		this.name = name;
		this.pay = pay;
	}
	
	//게터
	public String getName() { // 이름 게터
		return this.name;
	}
	
	public int getPay() { // 연봉 게터
		return this.pay;
	}
	
	//메소드
	
	public void getInformation() {
		System.out.println("이 름 : " + name);
		System.out.println("연 봉 : " + pay);
	}
	public void print() {
		System.out.println("SuperClass");
	}
	

}
