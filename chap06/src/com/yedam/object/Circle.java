package com.yedam.object;

//클래스 선언
/*
 * static 필드          :public
 * instance 필드        :private
 * 생성자				   :public
 * getter, setter 	   :public
 * 메서드 				:public (일부 private)
 */

public class Circle {

	static double pi = 3.14;
	private double r;
	// r 필드 초기화 생성자
	
	public Circle(double r) {
		this.r = r;
	}
	//r read/write //setter, getter
		
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	public Circle(){
		
	}

	public double area() {
		double result = pi * r * r;
		return result;
	}
}
