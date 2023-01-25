package com.yedam.java.day0117_2;

public interface Notebook {
	// 필드
	public static final int NOTEBOOK_MODE = 1;

	// 메소드
	// 문서를 작성하는 기능
	public abstract void writeDocumentaion();

	//인터넷을 검색하는 기능
	public abstract void searchInternet();
	
	public void changeMode();
}
