package com.yedam.java.ch01_01;

public class DmbCellPhone extends CellPhone{
	//필드
	String model;
	int channel;
	//생성자
	public DmbCellPhone(String model, String color, int channel) {
		super(model,color);
		/*
		 * this.model = model; 
		 * this.color = color; 
		 */
		 this.channel = channel;
	}
	//메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
