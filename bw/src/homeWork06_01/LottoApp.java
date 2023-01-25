package homeWork06_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoApp {

	Scanner sc = new Scanner(System.in);

	int menu = 0;

	List<int[]> list = new ArrayList<>();

	public LottoApp() {
		run();
	}

	private void run() {

		while (menu != 99) {
			menuInfo();
			menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				//로또 생성
				makeLotto();
				break;
			case 2:
				//로또 조회(내가 투입한 금액과 출력 번호)
				showInfo();
				break;

			case 99:
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

	private void menuInfo() {
		System.out.println("메뉴를 선택");
		
	}

	private void makeLotto() {
		System.out.println("금액");
		int money;
		money = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < (money / 1000); i++) {
			//list에 int형 배열이 객체로 들어간다.
			list.add(makeNumber());
		}
		System.out.println("번호 출력 완\n");
	}
	
	private void showInfo() {
		System.out.println("구매 한 금액> " + (list.size() * 1000 + "원"));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println((i % 5 + 1 ) + "번>");
			
			for(int j = 0 ; j < 6; j ++) {
				System.out.println(list.get(i)[j] + " ");
			}
			System.out.println();
			
			if ((i+1) !=0 && (i+1) % 5 == 0) {
				System.out.println(" ---------------------------");
			}
		}
		
		
	}

	private int[] makeNumber() {
		
		int[] lottoNo = new int[6];
		for (int i = 0; i < 6; i++) {
			lottoNo[i] = (int) (Math.random() * 45) + 1;
			
			for (int j = 0; j < i; j++) {
				// 중복제거
				if (lottoNo[j] == lottoNo[i]) {
					i-=1;
					break;
					// 값이 중복이면 i를 한번더 돌리기
				}

			}

		}
		return lottoNo;
	}
}
