package com.yedam;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		게시판.관리자계정생성();
		게시판.명령어리스트();

		자유게시판 자유게시판 = new 자유게시판();
		공지사항 공지사항 = new 공지사항();

		String 명령;

		while (true) {
			System.out.print("게시판) ");

			명령 = sc.nextLine();

			String 디테일번호 = 명령.replaceAll("[^0-9]", "");

			// 자유게시판
			if (명령.equals("자유게시판")) {
				자유게시판.리스트();
			} 
			
			else if (명령.equals("자유쓰기")) {
				if (게시판.로그인여부 == true) {
					자유게시판.글작성();
				} 
				
				else {
					System.out.println("로그인한 회원만 작성 가능합니다.");
				}
				
			} 
			
			else if (명령.equals("자유게시판 " + 디테일번호)) {
				
				int 게시글번호 = Integer.parseInt(디테일번호);
				boolean 자유존재 = false;
				
				for (int i = 0; i < 자유게시판.마지막글번호; i++) {
					if (게시글번호 == 자유게시판.게시물[i].글번호a) {
						자유게시판.상세보기(i);
						자유존재 = true;
						break;
					}
				}
				
				if (자유존재 == false) {
					System.out.println("게시글이 존재하지 않습니다.");
				}
				
				자유존재 = false;
			}

			// 회원관련
			else if (명령.equals("로그인")) {
				게시판.로그인();
			} else if (명령.equals("로그아웃")) {
				게시판.로그아웃();
			} else if (명령.equals("회원가입")) {
				게시판.회원가입();
			} else if (명령.equals("유저정보")) {
				if (게시판.접속회원 == null) {
					System.out.println("로그인 하십시오.");
				} else {
					게시판.회원정보보기(게시판.접속회원.고유번호);
				}
			}

			// 공지사항
			else if (명령.equals("공지사항")) {
				공지사항.리스트();
			} 
			
			else if (명령.equals("공지쓰기")) {
				if (게시판.로그인여부 == true) {
					공지사항.글작성();
				} 
				
				else {
					System.out.println("로그인한 회원만 작성 가능합니다.");
				}
				
			} 
			
			else if (명령.equals("공지사항 " + 디테일번호)) {
				
				int 게시글번호 = Integer.parseInt(디테일번호);
				boolean 공지존재 = false;
				
				for (int i = 0; i < 공지사항.마지막글번호; i++) {
					if (게시글번호 == 공지사항.게시물[i].글번호a) {
						공지사항.상세보기(i);
						공지존재 = true;
						break;
					}
				}
				
				if (공지존재 == false) {
					System.out.println("게시글이 존재하지 않습니다.");
				}
				
				공지존재 = false;
			}

			// 기타
			else if (명령.equals("도움말")) {
				게시판.명령어리스트();
			} else if (명령.equals("종료")) {
				System.out.println("== 게시판 종료 ==");
				System.exit(0);
			}
		}
	}
}

class 게시판 {
	static Scanner sc2 = new Scanner(System.in);

	// 게시판 관련
	String 게시판이름;
	게시물[] 게시물 = new 게시물[1000];
	댓글[] 댓글 = new 댓글[10000];
	int 마지막댓글번호;
	int 마지막글번호;
	int 게시글갯수 = 0;
	int 추천자;

	// 회원정보 관련
	static 회원정보[] 계정 = new 회원정보[1000];
	static int 회원번호 = 1;
	static boolean 로그인여부 = false;
	static 회원정보 접속회원 = new 회원정보();

	static void 관리자계정생성() {
		회원정보 임시계정 = new 회원정보();
		임시계정.계정생성날짜 = "관리자입니다.";
		임시계정.고유번호 = 99;
		임시계정.닉네임 = "관리자";
		임시계정.배열번호 = 0;
		임시계정.비밀번호 = "admin";
		임시계정.아이디 = "admin";
		임시계정.접속횟수 = 0;

		계정[0] = 임시계정;
	}

	// 기타
	int 현재페이지 = 0;

	static void 명령어리스트() {
		System.out.println("== 명령어 리스트 ==");
		// 공지사항 관련
		System.out.println();
		System.out.println(" * 공지사항 * ");
		System.out.println("공지사항 : 공지사항 목록보기");
		System.out.println("공지쓰기 : 공지사항 작성하기");
		System.out.println("공지상세 {$공지글 번호} : 공지사항 상세보기");

		// 자유게시판 관련
		System.out.println();
		System.out.println(" * 자유게시판 * ");
		System.out.println("자유게시판 : 자유게시판 글목록 불러오기");
		System.out.println("자유쓰기 : 자유게시판에 게시글 추가");
		System.out.println("자유게시판 {$게시글 번호} : 자유게시판 글 상세보기");

		// 회원관련
		System.out.println();
		System.out.println(" * 사용자 * ");
		System.out.println("로그인 : 로그인하기");
		System.out.println("로그아웃 : 로그아웃하기");
		System.out.println("회원가입 : 회원가입하기");
		System.out.println("유저정보 : 회원정보 보기 및 닉네임 수정");

		// 기타
		System.out.println();
		System.out.println(" * 기타 * ");
		System.out.println("종료 : 게시판 종료");
		System.out.println("도움말 : 명령어 리스트 출력");
		System.out.println("===================");
	}

	void 리스트() {
		if (this.게시글갯수 == 0) {
			System.out.println("==== " + this.게시판이름 + " ====");
			System.out.println("게시물이 존재하지 않습니다.");
			System.out.println("================");
		}

		else {
			int 페이지수;
			if (this.게시글갯수 % 10 != 0) {
				페이지수 = (this.게시글갯수 / 10) + 1;
			} else {
				페이지수 = (this.게시글갯수 / 10);
			}
			this.페이징(페이지수);
		}
	}

	void 글작성() {

		Scanner sc3 = new Scanner(System.in);
		this.마지막글번호++;
		this.게시글갯수++;
		게시물 임시게시물1 = new 게시물();
		System.out.println("== " + this.게시판이름 + " 글작성 ==");
		System.out.print("제목 : ");
		임시게시물1.글제목 = sc3.nextLine();
		System.out.print("내용 : ");
		임시게시물1.글내용 = sc3.nextLine();
		System.out.println("=================");
		임시게시물1.글번호a = 마지막글번호;
		임시게시물1.작성자번호 = 접속회원.고유번호;
		임시게시물1.작성자ID = 접속회원.아이디;
		임시게시물1.작성자닉네임 = 접속회원.닉네임;

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = format1.format(cal.getTime());
		임시게시물1.작성시간 = date;

		this.게시물[마지막글번호 - 1] = 임시게시물1;
	}

	void 상세보기(int 번호) {
		if (this.게시물[번호] != null) {
			this.게시물[번호].조회수++;
			System.out.println("== 게시물 상세 ==");
			System.out.println("글번호 : " + this.게시물[번호].글번호a);
			System.out.println("날짜 : " + this.게시물[번호].작성시간);
			System.out.println("작성자 : " + this.게시물[번호].작성자닉네임);
			System.out.println("------------------");
			System.out.println("제목 : " + this.게시물[번호].글제목);
			System.out.println("------------------");
			System.out.println("내용 : " + this.게시물[번호].글내용);
			System.out.println();
			System.out.println("------------------");
			System.out.println("조회수 : " + this.게시물[번호].조회수);
			System.out.println("추천 : " + this.게시물[번호].추천수);
			System.out.println("댓글수 : " + this.게시물[번호].댓글수);
			System.out.println("==================");
			System.out.println("실행할 커맨드를 입력해주세요.");
			System.out.println("(추천/수정/삭제/댓글확인/댓글작성/나가기)");

			while (true) {
				String 게시물커맨드 = sc2.nextLine();

				if (게시물커맨드.equals("추천")) {
					if (로그인여부 == false) {
						System.out.println("로그인 하십시오.");
						break;
					} else {
						this.게시글추천(번호);
						break;
					}

				} else if (게시물커맨드.equals("수정")) {
					if (로그인여부 == false) {
						System.out.println("로그인 하십시오.");
						break;
					} else if (this.게시물[번호].작성자번호 == 접속회원.고유번호) {
						System.out.println("게시물을 수정하시겠습니까? (예/아니오)");
						String 예니오 = sc2.next();
						if (예니오.equals("예")) {
							this.게시글수정(번호);
							break;
						} else if (예니오.equals("아니오")) {
							System.out.println("게시물을 수정하지 않습니다.");
							break;
						}
					} else {
						System.out.println("게시글을 작성한 회원만 수정할 수 있습니다.");
					}

					break;
				} else if (게시물커맨드.equals("삭제")) {
					if (로그인여부 == false) {
						System.out.println("로그인 하십시오.");
						break;
					} else if (this.게시물[번호].작성자번호 == 접속회원.고유번호 
							|| 접속회원.고유번호 == 99) {
						System.out.println("게시물을 삭제하시겠습니까? (예/아니오)");
						String 예니오 = sc2.next();
						if (예니오.equals("예")) {
							this.게시글삭제(번호);
							break;
						} else if (예니오.equals("아니오")) {
							System.out.println("게시물을 삭제하지 않습니다.");
							break;
						} else {
							System.out.println("잘못 입력하셨습니다.");
						}
					} else {
						System.out.println("게시글을 작성한 회원만 삭제할 수 있습니다.");
					}
					break;
				} else if (게시물커맨드.equals("나가기")) {
					break;
				} else if (게시물커맨드.equals("댓글확인")) {
					this.댓글확인(this.게시물[번호].글번호a, this.게시물[번호].댓글수);

					System.out.println("실행할 커맨드를 입력해주세요.");
					System.out.println("(추천/수정/삭제/댓글확인/댓글작성/나가기)");
				} else if (게시물커맨드.equals("댓글작성")) {
					if (로그인여부 == false) {
						System.out.println("로그인 하십시오.");
						break;
					} else {
						this.댓글작성(this.게시물[번호].글번호a);

						System.out.println("실행할 커맨드를 입력해주세요.");
						System.out.println("(추천/수정/삭제/댓글확인/댓글작성/나가기)");
					}

				} else {
					System.out.println("다시 입력해주세요");
				}
			}
		}

		else if (this.게시물[번호] != null) {
			System.out.println("이 게시물은 삭제되었습니다.");
		}

		else if (this.게시물[번호] == null) {
			System.out.println("게시물이 존재하지 않습니다.");
		}
	}

	static void 로그인() {

		if (로그인여부 == false) {
			while (true) {
				System.out.print(" ID : ");
				String 입력ID = sc2.next();
				System.out.print(" PASSWORD : ");
				String 입력Pass = sc2.next();

				int c = 0;
				while (c <= 회원번호) {
					if (계정[c] == null) {
						System.out.println("다시 시도하여 주십시오.");
						break;
					} else if (입력ID.equals(계정[c].아이디) && 입력Pass.equals(계정[c].비밀번호)) {
						System.out.println("로그인 되었습니다.");
						로그인여부 = true;

						계정[c].접속횟수++;
						접속회원 = 계정[c];

						break;
					} else if (c == 회원번호) {
						System.out.println("로그인을 다시 시도하여 주십시오.");
						break;
					} else {
						c++;
					}
				}
				break;
			}
		}

		else {
			System.out.println("이미 로그인 되어있습니다.");
		}

	}

	static void 회원가입() {

		회원가입절차: if (로그인여부 == false) {
			while (true) {
				System.out.println("사용하실 아이디를 입력해주십시오.");
				System.out.print(" ID : ");
				String 입력ID = sc2.next();
				System.out.println("사용하실 비밀번호를 입력해주십시오. ");
				System.out.print(" PASSWORD : ");
				String 입력Pass = sc2.next();
				System.out.println("사용하실 닉네임을 입력해주십시오. ");
				String 입력nic = sc2.next();

				int c = 0;
				while (c < 회원번호) {
					if (입력ID.equals(계정[c].아이디)) {
						System.out.println("아이디가 중복되었습니다. 가입을 다시 시도해주세요.");

						break 회원가입절차;
					} else {
						c++;
					}
				}

				회원정보 임시계정 = new 회원정보();
				임시계정.아이디 = 입력ID;
				임시계정.비밀번호 = 입력Pass;
				임시계정.닉네임 = 입력nic;
				임시계정.고유번호 = 회원번호 + 100;
				임시계정.배열번호 = 회원번호;

				Calendar cal = Calendar.getInstance();
				SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String date = format1.format(cal.getTime());
				임시계정.계정생성날짜 = date;

				계정[회원번호] = 임시계정;

				회원번호++;

				System.out.println("계정이 생성되었습니다. 로그인해주십시오.");
				게시판.로그인();

				break;
			}
		} else {
			System.out.println("이미 로그인 되어있습니다.");
		}
	}

	static void 로그아웃() {
		if (로그인여부 == true) {
			System.out.println("로그아웃 되었습니다.");
			게시판.로그인여부 = false;
			접속회원 = null;
		} else {
			System.out.println("로그인이 되어있지 않습니다.");
		}
	}

	static void 회원정보보기(int num) {
		if (로그인여부 == true) {
			System.out.println("아이디 : " + 접속회원.아이디);
			System.out.println("닉네임 : " + 접속회원.닉네임);
			System.out.println("고유번호 : " + 접속회원.고유번호);
			System.out.println("접속횟수 : " + 접속회원.접속횟수);
			System.out.println("생성일자 : " + 접속회원.계정생성날짜);
			// 닉네임 수정
			System.out.println("* 닉네임을 수정하시겠습니까? (예/아니오)");
			String 예니오 = sc2.next();

			if (예니오.equals("아니오")) {
				System.out.println("닉네임을 수정하지 않습니다.");

			} else if (예니오.equals("예")) {
				System.out.println("* 수정할 닉네임을 입력해주십시오.");
				System.out.print("닉네임 : ");
				String 임시닉네임 = sc2.next();
				sc2.nextLine();
				접속회원.닉네임 = 임시닉네임;

				계정[접속회원.배열번호].닉네임 = 접속회원.닉네임;

				System.out.println("* 닉네임이 변경되었습니다.");
			}
		} else {
			System.out.println("로그인이 되어있지 않습니다.");
		}
	}

	void 게시글수정(int n) {
		System.out.println("제목을 수정하시겠습니까? (예/아니오)");
		String 예니오 = sc2.next();
		if (예니오.equals("예")) {
			System.out.println("제목을 입력하세요.");
			String 제목수정 = sc2.next();
			this.게시물[n].글제목 = 제목수정;
		} else if (예니오.equals("아니오")) {
			System.out.println("제목을 수정하지 않습니다.");
		}
		System.out.println("내용을 수정하시겠습니까? (예/아니오)");
		String 예니오2 = sc2.next();
		if (예니오2.equals("예")) {
			System.out.println("내용을 입력하세요.");
			String 내용수정 = sc2.next();
			this.게시물[n].글내용 = 내용수정;
		} else if (예니오2.equals("아니오")) {
			System.out.println("내용을 수정하지 않습니다.");
		}
	}

	void 게시글삭제(int n) {

		for (int i = n; i < this.마지막글번호; i++) {
			this.게시물[i] = this.게시물[i + 1];
		}
		this.게시글갯수--;
		System.out.println("게시물이 삭제되었습니다.");
	}

	void 페이징(int 페이지수) {
		int 지금페이지 = 현재페이지 + 1;

		System.out.println("===== " + this.게시판이름 + " =====");
		System.out.println("번호 ㅣ 날짜                 ㅣ [제목](댓글) [조회수/추천수] [작성자] ");
		for (int i = 현재페이지 * 10; i <= (현재페이지 * 10) + 9; i++) {
			if (this.게시물[i] == null) {
			} else {
				System.out.printf("%04d ㅣ %s  ㅣ [%s](%d) [%d/%d] [%s] \n", this.게시물[i].글번호a,
						this.게시물[i].작성시간, this.게시물[i].글제목, this.게시물[i].댓글수,
						this.게시물[i].조회수, this.게시물[i].추천수, this.게시물[i].작성자닉네임);
			}
		}
		System.out.println("=========[" + 지금페이지 + "]=========");

		while (true) {
			System.out.println("실행할 커맨드를 입력해주세요.");
			System.out.println("(이전페이지/다음페이지/나가기)");
			String 리스트커맨드 = sc2.next();

			if (리스트커맨드.equals("이전페이지")) {
				if (지금페이지 == 1) {
					System.out.println(" * 첫 페이지입니다.");
				} else {
					현재페이지--;
					this.페이징(페이지수);
					break;
				}
			} else if (리스트커맨드.equals("다음페이지")) {
				if (지금페이지 == 페이지수) {
					System.out.println(" * 마지막 페이지입니다.");
				} else {
					현재페이지++;
					this.페이징(페이지수);
					break;
				}
			} else if (리스트커맨드.equals("나가기")) {
				this.현재페이지 = 0;
				break;
			}
		}
	}

	void 댓글확인(int 글번호, int 댓글수) {

		if (this.게시물[글번호 - 1].댓글수 == 0) {
			System.out.println(" * 댓글이 존재하지 않습니다.");
		} else {
			System.out.println("=== 댓글 목록 ===");
			System.out.println("[작성자] ㅣ [내용]                      ㅣ [댓글시간]  ");
			for (int i = 0; i < 마지막댓글번호; i++) {
				if (this.댓글[i].달린게시물번호 == 글번호) {
					System.out.printf("[%s] ㅣ [%s]                      ㅣ [%s]  \n", this.댓글[i].댓글작성자, this.댓글[i].댓글내용,
							this.댓글[i].댓글등록시간);
				}
			}
			System.out.println("=================");
		}
	}

	void 댓글작성(int 글번호) {
		댓글 임시댓글 = new 댓글();
		System.out.println("=== 댓글 작성 ===");
		임시댓글.댓글작성자 = 접속회원.닉네임;
		System.out.print("댓글 : ");
		임시댓글.댓글내용 = sc2.nextLine();
		임시댓글.달린게시물번호 = 글번호;

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = format1.format(cal.getTime());
		임시댓글.댓글등록시간 = date;

		this.댓글[마지막댓글번호] = 임시댓글;
		this.마지막댓글번호++;
		this.게시물[글번호 - 1].댓글수++;

		System.out.println("댓글이 등록되었습니다.");
		System.out.println("=================");

	}

	void 게시글추천(int 번호) {

		boolean a = true;
		추천절차: while (a) {
			for (int i = 0; i < 회원번호; i++) {
				if (게시물[번호].추천자ID[i] == 접속회원.고유번호) {
					System.out.println("중복 추천은 불가능합니다.");
					break 추천절차;
				}
			}

			this.게시물[번호].추천수++;
			this.게시물[번호].추천자ID[추천자] = 접속회원.고유번호;
			this.추천자++;
			System.out.println("추천 하였습니다.");
			a = false;
		}
	}
}

class 게시물 {
	String 글제목;
	String 글내용;
	String 작성시간;
	int 글번호a;
	int 추천수;
	int 조회수;
	int 작성자번호;
	String 작성자ID;
	String 작성자닉네임;
	int 댓글수;
	int[] 추천자ID = new int[1000];
}

class 회원정보 {
	String 아이디;
	String 비밀번호;
	int 고유번호;
	int 접속횟수;
	String 닉네임;
	String 계정생성날짜;
	int 배열번호;

}

class 댓글 {
	int 달린게시물번호;
	String 댓글작성자;
	String 댓글내용;
	String 댓글등록시간;
}

class 자유게시판 extends 게시판 {
	자유게시판() {
		게시판이름 = "자유게시판";
	}
}

class 공지사항 extends 게시판 {
	공지사항() {
		게시판이름 = "공지사항";
	}
}