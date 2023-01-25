package com.yedam.java.day0117_2;

public interface Tablet {
	
	//필드
	public static final int TABLET_MODE = 2;
	
	
	
	//메소드
	//영상을 출력하는 기능
	public abstract void watchVideo();
	
	//앱을 사용하는 기능
	public abstract void useApp();
	
	public void changeMode();
}
