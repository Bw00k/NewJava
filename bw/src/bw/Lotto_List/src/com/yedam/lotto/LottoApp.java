package bw.Lotto_List.src.com.yedam.lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoApp {
	public static void main(String[] args) {

	}

	public LottoApp() {
		run();
	}

	private int[] myNum = new int[6];
	private int[] lotto = new int[6];

	private void run() {

		while (true) {

			switch () {
			case 1:
				//로또 생성
				for (int i = 0; i < 6; i++) {
					lotto[i] = (int) (Math.random() * 45) + 1;
					for (int j = 0; j < i; j++) {
						// 중복제거
						if (lotto[i] == lotto[j]) {
							i--;
							break;
							// 값이 중복이면 i를 한번더 돌리기
						}

					}

				}
				break;
			case 2:
				//로또 조회(내가 투입한 금액과 출력 번호)
				System.out.print("나의 번호 ");
				for (int i = 0; i < 6; i++) {
					System.out.print(myNum[i] + " ");
				}
				System.out.println();
				break;

			case 99:
				System.out.println("프로그램 종료");
				break;
			}
		}

	
	}
}}
