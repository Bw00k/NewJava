package com.yedam.java.homework;

public class ObesityInfo extends StandardWeightInfo {
//	3) ObesityInfo 클래스를 정의한다.
//	- StandardWeightInfo 클래스를 상속한다.
//	- 메소드는 다음과 같이 정의한다.
//	(1) public void getInformation() : 이름, 키, 몸무게와 비만도를 출력하는 기능
//	(2) public double getObesity() : 비만도를 구하는 기능
//	( * 비만도 : (Weight - 표준 체중)/표준체중 * 100 )
	
	//필드
	String condition;
	double cf;
	//생성자
	public ObesityInfo() {} //기본 생성자
	public ObesityInfo(String name, int cm, int kg) { // 생성자 초기화
		super(name,cm,kg);
	}
	//메소드
	public void getInformation() {
		System.out.print(name + "님의 신장 " + cm + ", 몸무게 " + kg +", 비만도 " + conditionFactor());
	}
	public String conditionFactor() {
		if(0 <= getObesity() && getObesity() <= 18) {
			condition = "마른 체형입니다.";
		}else if(19 <= getObesity() && getObesity() <= 28) {
			condition = "정상 체형 입니다.";
		}else{
			condition = "비만 입니다.";
		}
		return condition;
	}
	public double getObesity() {
		cf = (kg - avgKg)/avgKg * 100;
		return cf;
	}
}
