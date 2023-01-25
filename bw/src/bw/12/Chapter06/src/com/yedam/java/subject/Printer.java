package com.yedam.java.subject;

public class Printer {
	// 책 269페이지 4번
	// println()메소드 -> 매개값은 각 int, boolean, double, String을 줄 수 있습니다.
	// 메소드 오버로딩 문제
	public void println(int num) {
		System.out.println(num);
	}
	
	public void println(boolean bool) {
		System.out.println(bool);
	}
	
	public void println(double num) {
		System.out.println(num);
	}
	
	public void println(String str) {
		System.out.println(str);
	}
}
