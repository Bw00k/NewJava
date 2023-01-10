package com.yedam.condition;

public class IfCondition {
public static void main(String[] args) {
	int score = 93;
	
	if(score >= 90) {
		System.out.println("점수가 90 이상이고, 등급 A");
	}
	
	//실행문이 한 줄 일때만 사용
	if(score >= 90)
		System.out.println("점수가 90이상이고, 등급A");
		System.out.println("스코어가 90");
		
		//if-else
		if(score>=90) {
			System.out.println("점수가 90이상입니다.");
			System.out.println("등급은 A입니다.");
		}else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		
		//else - if
		//if문(조건식을 여러 개 사용 할 때)
		score = 70;
		if(score >= 90) {
			System.out.println("등급 A");
		} else if(score >=80) {
			System.out.println("등급 B");
		} else if(score >=70) {
			System.out.println("등급 C");
		} else {
			System.out.println("등급 D");
		}
		//random 값 추출
		//Random() / Math.random()
		System.out.println(Math.random());
		//0 * 10 <= Math.random() * 10 < 1*10
		
		// 0 <= Math.random() * 10<10
		//int number = (int)5.12;
		
		// 0~9.xxxxx => (int) 0 ~ (int) 9
		//(int) 0 <= (int) Math.random() * 10 < (int) 10
		
		// 0~9 => 1~10
		//(int) 0 + 1 <= (int) Math.random() * 10 + 1 < (int) 10 + 1
		
		//주사위의 번호 뽑기
		
		// 0 <= x <= 1
		// 0 * 6 <= x*6 <0.9xxxxxx*6
		// 0 <= x*6 < 0.5xxxxx
		// 0 <= (int) x*6 < 5
		// 0+1 <= (int) x*6+1 < 5+1
		// 1<= (int) (x*6)+1<6
		int number = (int) (Math.random() * 6);
		
		if(number == 1) {
			System.out.println("1번 나옴");
		} else if(number ==2) {
			System.out.println("2번나옴");
		}else if(number ==3) {
			System.out.println("3번나옴");
		}else if(number ==4) {
			System.out.println("4번나옴");
		}else if(number ==5) {
			System.out.println("5번나옴");
		}else {
			System.out.println("6번나옴");
		}
}
}
