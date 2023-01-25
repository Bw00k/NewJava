package com.yedam.java.homework;

public class EmpDept extends Employee {
	//	2) EmpDept 클래스를 정의한다.
	//	- Employee 클래스를 상속한다.
	//	- 추가로 부서이름을 필드로 가지며 생성자를 이용하여 값을 초기화한다.
	//	- 추가된 필드의 getter를 정의한다.
	//	- Employee 클래스의 메소드를 오버라이딩한다.
	//	(1) public void getInformation() : 이름과 연봉, 부서를 출력하는 기능
	//	(2) public void print() : "수퍼클래스\n서브클래스"란 문구를 출력하는 기능
	//필드
	String departmentName;
	
	//생성자 - 부서이름 추가
	public EmpDept() {}
	public EmpDept(String name, int pay, String departmentName) {
		super(name,pay);
		this.departmentName = departmentName;
	}
	
	//부서이름 게터
	public String getDepartmentName() {
		return this.departmentName;
	}
	
	//메소드
	@Override
	public void getInformation() {
		System.out.println("부서이름 : " + departmentName);
		
	}
	public void print() {
		System.out.println("SubClass");
	}

}
