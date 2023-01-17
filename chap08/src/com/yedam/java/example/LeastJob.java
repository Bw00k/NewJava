package com.yedam.java.example;

public class LeastJob implements Scheduler {
	//쉬고 있거나 대기가 가장 적은 상담원에게 할당
	@Override
	public void getNextCall() {
		System.out.println("상담 순서를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담 업무가 없거나 대기가 가장 적은 상담원에게 할당합니다.");
	}

}
