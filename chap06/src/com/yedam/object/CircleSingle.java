package com.yedam.object;

public class CircleSingle {
	//싱글톤
	private static CircleSingle instance = new CircleSingle();
	
	static CircleSingle getInstance() {
		return instance;
	}

	static final double pi = 3.14;
	double r;
	// r 필드 초기화 생성자
	private CircleSingle() {}

	CircleSingle(double r) {
		this.r = r;
	}
	

	double area() {
		double result = pi * r * r;
		return result;
	
	}
}
