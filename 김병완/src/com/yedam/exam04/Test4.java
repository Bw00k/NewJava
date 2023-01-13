package com.yedam.exam04;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		
		Dice diceAry[] = null;
		int diceNum = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("===1.주사위 크기 2.주사위 굴리기 3.결과보기 4.가장 많이 나온 수 5.종료 ===");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if (selectNo == 1) {
				System.out.println("주사위 크기>");
				diceNum = Integer.parseInt(sc.nextLine());
			}else if (selectNo == 2) {
				for(i=0; i<diceNum.length; i++) {
					int n1 =(int)(Math.random()*6)+1;
					System.out.println(i+"번째 주사위 결과 : " +n1);
				}
			}else if(selectNo ==3) {
				
			}else if(selectNo ==4) {
				
			}else if(selectNo ==5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
	
}
