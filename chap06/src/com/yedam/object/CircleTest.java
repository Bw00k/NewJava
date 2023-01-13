package com.yedam.object;

public class CircleTest {
	public static void main(String[] args) {
		//반지름 5 원의 면적 계산
		// circcle 객체 생성
		//static = 정적 = 공유
		//클래스파일 로딩시점에 메모리에 할당
		//객체생성 없이 클래스 이름으로 스태틱 필드 접근이 가능
		System.out.println(Circle.pi);
		Circle cr = new Circle(5);
		
		//반지름 5 초기화

		//area
		double a =	cr.area(); 
		
		//결과 출력
	System.out.println(a);
	
	Circle cr2 = new Circle();
	cr.r=10;
	
	CircleSingle circleSingle =
			CircleSingle.getInstance();
//	CircleSingle circleSingle2 =
//			CircleSingle.getInstance();
	
	
	circleSingle.r=20;
	circleSingle.area();
	}
}
