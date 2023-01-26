package com.yedam;

import java.util.List;
import java.util.Scanner;

public class EmpMain {

	static EmpDAO dao = new EmpDAO();

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		
		while (true) {
			System.out.println("1)목록조회 2)단건조회 3)입력 4)급여변경 5)삭제 9)종료");
			int menu = scn.nextInt();

			if (menu == 5) {
				delete();
			} else if (menu == 4) {// 사원번호, 급여 입력. updateEmp(int id, int sal)
				sal();
			} else if (menu == 3) {
				// 입력처리. :=> 사번, last_name, 이메일, 입사일자, 직무:
				update();

			} else if (menu == 2) {
				// 단건조회.
				search();

			} else if (menu == 1) {
				// 목록조회
				list();
//				
			} else if (menu == 9) {
				// 종료
				break;
			} // end of while()

		}

//		
		System.out.println("end of program");
	}

	public static void list() {
//	List<Map<String, Object>> result = dao.empList();// 반환유형.
//	for (Map<String, Object> map : result) {
//		System.out.println(
//				"사원번호: " + map.get("emp_id") + ", 이름: " + map.get("first_name") + "-" + map.get("last_name"));
//	}

		List<EmpVO> list = dao.empVoList();
		for (EmpVO emp : list) {
			System.out.println(emp.toString());
		}
	}// static메소드 or 인스턴스메소드

	public static void sal() {
		System.out.println("사원번호입력 >>");
		int eid = scn.nextInt();
		System.out.println("변경 급여 입력 >> ");
		int sal = scn.nextInt();

		if (dao.updateEmp(eid, sal) > 0) {
			System.out.println("변경 완료");
		} else {
			System.out.println("처리중 에러");
		}
	}

	public static void update() {
		System.out.println("사번입력>> ");
		int eid = scn.nextInt();
		scn.nextLine();
		System.out.println("이름>> ");
		String name = scn.nextLine();
		System.out.println("이메일>> ");
		String mail = scn.nextLine();
		System.out.println("입사일자>> ");
		String hDate = scn.nextLine();
		System.out.println("직무>> ");
		String job = scn.nextLine();

		EmpVO emp = new EmpVO();
		emp.setEmployeeId(eid);
		emp.setFirstName(name);
		emp.setEmail(mail);
		emp.setHireDate(hDate);
		emp.setJobId(job);
		;
	}

	public static void search() {
		System.out.println("조회사원번호 입력>> ");
		int id = scn.nextInt();
// 사용자 입력값을 받아서 처리.

		EmpVO emp = dao.getEmp(id);
		if (emp == null) {
			System.out.println("조회된 정보 없음!!");
			continue;
		}
		; // 반환유형: EmpVO
		System.out.println("결과: " + emp);
	}
	public static void delete() {
		System.out.println("제명 사원 입력>> ");
	int eid = scn.nextInt();
	
	}
	
	public void exe() {

		
	}
}
