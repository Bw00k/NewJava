package com.yedam.condition;

import java.util.Scanner;



public class SwitchCondition {
public static void main(String[] args) {
	int number = (int) (Math.random()*6) +1;
	System.out.println(number);
	switch(number) {
	case 1:
		System.out.println("1번 나옴");
		break;
	case 2:
		System.out.println("2번 나옴");
		break;
	case 3:
		System.out.println("3번 나옴");
		break;
	case 4:
		System.out.println("4번 나옴");
		break;
	case 5:
		System.out.println("5번 나옴");
		break;
	default: //else
		System.out.println("6번 나옴");
		break;		
	}
	
	//char
	
	char grade = 'B';
	String grade2 = "b";
	
	switch(grade) {
	case 'A':
		System.out.println("우수 회원");
		break;
	case 'B':
	case 'b':
		System.out.println("일반 회원");
		break;
	default:
		System.out.println("손님");	
		break;
	}
	
	//입력한 성적을 등급으로 환산
	Scanner sc = new Scanner(System.in);
	//90,80,70,60
	//0~100
	//99~90 :A
	//89~80 :B
	//79~70 :C
	// 70 아래는 D등급
	System.out.println("입력>");
	int scores = Integer.parseInt(sc.nextLine());
	
	switch (scores) {
	case 10:
	case 9:
		System.out.println("A등급");
		break;
	case 8:
		System.out.println("B등급");
		break;
	case 7:
		System.out.println("C등급");
		break;
	default:
		System.out.println("D등급");
		break;
	}
	
//	//중첩 if문
//	int no = 10;
//	//no가 2의 배수
//	if(no % 2 == 0) {
//		//no가 5의 배우
//		if(no % 5== 0) {
//			//no 가 10의 배수
//			if(no % 10 == 0) {
//				System.out.println("no는 10의 배수입니다.");
//				
//			}
//		}
//	}
//	

	
	Scanner sc1 = new Scanner(System.in);
	
	System.out.println("점수입력>");
	
	scores = Integer.parseInt(sc1.nextLine());
	String grade1 = "";
	if(scores >= 90 ) {
		if(scores >= 95) {
			grade1 = "A+";
		}else {
			grade1 = "A";
			
		}
	}
	System.out.println("획득한 학점 : " + grade1);
}
}
