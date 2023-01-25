package com.yedam.java.homework;

public class EmployeeExp {

	public static void main(String[] args) {
		
		//	3) 아래와 같은 출력결과가 나오도록 실행코드를 구현한다.
		//	- 출력결과
		//	이름:이지나  연봉:3000  부서:교육부
		//	수퍼클래스
		//	서브클래스
		EmpDept empD = new EmpDept("이지나",3000,"교육부");
		Employee empL = new Employee();
		System.out.println("이름 : " + empD.getName() +
							" 연봉 : " + empD.getPay() +
							" 부서 : " + empD.getDepartmentName());
		empL.print();
		empD.print();
		
		

	}

}
