package com.yedam.object;

public class Book {
	
	String bookname;
	String kind = "학습서";
	int price;
	String com = "한빛미디어";
	String isbn;
	
	Book(){
		
	}
	

		
		
		Book(String isbn, String bookname){
			this.isbn = isbn;
			this.bookname = bookname;
			}
		//매개 변수 순서에 따른 생성자 오버로딩
		//데이터 타입 기준으로 순서를 따진다.
		Book(String isbn, int price){
			this.price = price;
			this.isbn = isbn;
		}
		void getInfo() {
			System.out.println("책 이름 : " + bookname);
			System.out.println("책 종류 : " + kind);
			System.out.println("책 가격 : " + price);
			System.out.println("출판사 : " + com);
			System.out.println("도서번호 : " + isbn);
	}
}
