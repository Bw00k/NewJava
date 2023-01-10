package com.yedam.print;

import java.io.IOException;
import java.util.Scanner;

public class KeyCode {
	public static void main(String[] args) throws IOException {
		//하나의 문자를 받아올 때(keyCode)
		
		int keyCode = 0;

		System.out.println("입력>");
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);

		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);

		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
		//Scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력>");
		//scanner.nextLine()
		//=> enter키 이전까지 데이터를 받아 오세요
		//=> enter를 기준으로 데이터를 읽어옴.
		String inputDate = scanner.nextLine();
		// scanner.nextInt();
		System.out.println("Scanner 활용 : " + inputDate);
		
		//기본 타입, == ( 1==1, 1.2==1.3 )
		//문자열 내용 비교.
		if(inputDate.equals("yedam")) {
			System.out.println("yedam과 일치합니다.");
		}
		}
	}

