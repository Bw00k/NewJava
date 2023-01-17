package com.yedam.java.ch01_01;

public class SmartTelevision implements RemoteControl, Searchable {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub

	}
	@Override
	public void search(String url) {
		System.out.println(url + "를 검색합니다.");
	}

}
