package baord;

import java.util.Scanner;




public class BoardMain {

	static LogDAO dao = new LogDAO();
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		while (true) {
			System.out.println("1)회원가입 2)로그인 3)회원조회 4)회원탈퇴 99)종료");
			int menu = scn.nextInt();
			scn.nextLine();
			if(menu == 1) {
				
				addLog();
				
			}else if(menu == 2) {
				
			}else if(menu == 3) {
				
			}else if(menu == 4) {
				
			}else if(menu == 99) {
				break;
			}
	}

}
	public static void addLog() {
		System.out.println("아이디 입력>> ");
		String id = scn.nextLine();
		System.out.println("비밀번호 입력>> ");
		String pw = scn.nextLine();
		System.out.println("유효한 메일을 입력하세요>> ");
		String mail = scn.nextLine();
		
		LogVO log = new LogVO();
		log.setU_ID(id);
		log.setU_PW(pw);
		log.setU_MAIL(mail);
		if (dao.addLog(log)> 0) {
			System.out.println("가입 성공");

		} else {
			System.out.println("가입 실패");
		}
	}
	public static void check() {
		System.out.println("아이디 입력>> ");
		String id = scn.nextLine();
		LogVO log = new LogVO();
		log.setU_ID(id);
		
	}
}
