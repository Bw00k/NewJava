package com.yedam.java.homework;

public abstract class Culture {
//	1) Culture 클래스를 정의한다.
//	- 제목, 참여감독 수, 참여배우 수, 관객수, 총점을 필드로 가진다.
//	- 제목, 참여감독 수, 참여배우 수는 생성자를 이용하여 값을 초기화한다.
//	- 메소드는 다음과 같이 정의한다.
//	(1) public void setTotalScore(int score) : 관객수와 총점을 누적시키는 기능
//	(2) public String getGrade() : 평점을 구하는 기능//여기까지
//	(3) public abstract void getInformation() : 정보를 출력하는 추상메소드
	
	//필드
	String movieName;
	int director;
	int actor;
	int score;
	int theater;
	int total=0;
	//생성자
	public Culture() {} //기본생성자
	public Culture(String movieName,int director,int actor) {
		this.movieName = movieName;
		this.director = director;
		this.actor = actor;
	}
	
	//메소드
	public void setTotalScore(int score) {
		this.score = score;
		theater += theater;
		total += score;
	}
	public String getGrade() {
		return "☆";
		
	}
	public abstract void getInformation();
}
