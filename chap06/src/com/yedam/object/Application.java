package com.yedam.object;

public class Application {

	public static void main(String[] args) {
		
		//s1 = 인스턴스
		Student s1 = new Student();

		Student s2 = new Student();

//		System.out.println(s1);
//		System.out.println(s2);

		// dot 연산자(점(.))
//		s1.age = 20;
//		s1.name = "예담";
//		s1.schoolName = "예담대학교";
		
		/*
		 * s1.getInfo();
		 * 
		 * s2.age = 30; s2.name = "예담이"; s2.schoolName = "";
		 * 
		 * s2.getInfo();
		 */
		
//		s1.getInfo();
//		
//		s1.age = 20;
//		s1.name = "대학생";
//		
//		System.out.println("학생의 나이 : " + s1.age);
//		System.out.println("학생의 이름 : " + s1.name);
//		System.out.println("재학중인 학교 : " + s1.schoolName);
		
		Korean k1 = new Korean("김", "001111-0147777");
//		System.out.println("k1 가지고 있는 필드 값>");
//		System.out.println(k1.nation);
//		System.out.println(k1.name);
		System.out.println(k1.nation+" " + k1.name + k1.ssn);
	}

}
