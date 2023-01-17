package com.yedam.java.example;

public class PriorityAllocation implements Scheduler {
	//우선순위가 높은 고객 먼저 할당
	@Override
	public void getNextCall() {
		System.out.println("고객 등급이 높은 고객의 전화를 먼저 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 숙련도가 높은 상담원에게 우선적으로 배분됩니다.");
	}

}
