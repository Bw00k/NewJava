package com.yedam.object;

public class ExeApp {
	public static void main(String[] args) {
		
	
	//Book 클래스
	//책의 종류, 가격, 출판사, 도서번호의 정보
	//정보는 원하는 방식 아무거나 활용해서 정보 입력.
	//getInfo 메소드 객체가 가진 정보 출력.
	//getInfo의 출력 예시
	//혼자 공부하는 자바
	//# 내용
	//1)종류 : 학습서
	//2)가격 : 24000원
	//3)출판사 : 한빛미디어
	//4)도서번호 : yedam-001
	
	//다른 예시
	
	//이것이 리눅스다
		//# 내용
		//1)종류 : 학습서
		//2)가격 : 32000원
		//3)출판사 : 한빛미디어
		//4)도서번호 : yedam-002
//	Book s1 = new Book();
//
//	Book s2 = new Book();
//	s1.bookname= "혼자 공부하는 자바";
//	s2.bookname= "이것이 리눅스다";
//	s1.price=24000;
//	s2.price=32000;
//	s1.isbn="yedam-001";
//	s2.isbn="yedam-002";
//
//		s1.getInfo();
//		s2.getInfo();
		
		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Car car2 = new Car("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Car car3 = new Car("자가용","검정");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println(("car3.color : " + car3.color));
		System.out.println();
		
		Calculator ca = new Calculator();
		double result = ca.divide(1, 1);
		System.out.println(result);
		
		ca.powerOn();
		ca.powerOff();
		
		int sumResult = ca.sum2(1,2,3,4,5,6,7,8,98);
		System.out.println("총 합 : " + sumResult);
		ca.sum2(1,2,3,4,5);
		
		Score sc = new Score(50,30,70);
		sc.getInfo();
		
		System.out.println("A");
		System.out.println(1);
		System.out.println('C');
		System.out.println(0.1);
		System.out.println(true);
	}
	}
	

