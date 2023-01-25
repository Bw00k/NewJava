package com.yedam.java.day0117_3;

import java.util.Scanner;

public class PlayGame {
	// 필드
	Scanner sc = new Scanner(System.in);
	public int choice;
	public static int randomGame;
	public static int gameMode;
	RPGgame rpGgame = new RPGgame();
	ArcadeGame ag = new ArcadeGame();

	// 셍성자
	public PlayGame() {
	}

	// 메소드
	public int random() {
		// 게임 랜덤으로 고르기
		randomGame = (int)(Math.random());
		return randomGame;
	}

	public void game() {
		if (randomGame == 1) {
			System.out.println("RPGgame 실행");
			gameMode =0;

		} else{
			System.out.println("ArcadeGame 실행");
			gameMode=1;
		}
	}

	public void menu() {
		// 메뉴판
		System.out.println(
				"============================================================================================");
		System.out.println(
				"<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>");
		System.out.println(
				"============================================================================================");

		System.out.print("choice >> ");
		choice = Integer.parseInt(sc.next());
	}

	public void gamePlay() {
		if (gameMode == 0) {
			if (choice == 1) {
				rpGgame.leftUpButton();
			} else if (choice == 2) {
				rpGgame.leftDownButton();
			} else if (choice == 3) {
				rpGgame.rightUpButton();
			} else if (choice == 4) {
				rpGgame.rightDownButton();
			} else if (choice == 5) {
				rpGgame.changeMode();
			}else if (choice == 0) {
				System.out.println("ArcadeGame 실행");
				gameMode = 1;

			} else if (choice == 9) {
				System.out.println("EXIT");

			} else {
				System.out.println("메뉴에 없는 번호 입니다.");
			}
		}else {
			if (choice == 1) {
				ag.leftUpButton();
			} else if (choice == 2) {
				ag.leftDownButton();
			} else if (choice == 3) {
				ag.rightUpButton();
			} else if (choice == 4) {
				ag.rightDownButton();
			} else if (choice == 5) {
				ag.changeMode();
			}else if (choice == 0) {
				System.out.println("RPGgame 실행");
				gameMode = 0;

			} else if (choice == 9) {
				System.out.println("EXIT");

			} else {
				System.out.println("메뉴에 없는 번호 입니다.");
			}
		}
	}
}
