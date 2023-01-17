package com.yedam.java.ch02_02;

public class SmartTelevision implements SmartTV {
	
	//필드
	private int volume;

	@Override
	public void alarm(String time) {
		System.out.println(time + "에 알람을 맞췄습니다.");
	}

	@Override
	public void turnOn() {
	}

	@Override
	public void turnOff() {
	}

	@Override
	public void setVolume(int volume) {
	}

	@Override
	public void search(String url) {
		System.out.println(url + "를 검색합니다.");
	}

}
