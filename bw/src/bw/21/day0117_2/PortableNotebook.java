package com.yedam.java.day0117_2;

public class PortableNotebook implements Notebook, Tablet {
	//필드
	
	private int mode = NOTEBOOK_MODE;
	private String program;
	private String internet;
	private String kind;
	private String appKind;
	
	
	//셍성자
	public PortableNotebook() {}
	public PortableNotebook(String program,String internet,String kind,String appKind) {
		this.program = program;
		this.internet = internet;
		this.kind = kind;
		this.appKind = appKind;
	}
	
	
	
	
	
	
	public void mode() {
		if(mode == 1) {
			System.out.println("NOTEBOOK_MODE 입니다");
		}else {
			System.out.println("TABLET_MODE 입니다");
		}
	}
	
	
	//메소드 오버라이딩
	@Override
	public void watchVideo() {
		System.out.println(this.kind + "를 시청.");
	}

	@Override
	public void useApp() {
		if(mode == 1) {
			System.out.println(this.appKind +"를 실행.");
			mode = 2;
		}else{
			System.out.println(this.appKind +"를 실행.");
		}
	}

	@Override
	public void writeDocumentaion() {
		System.out.println(this.program + "을 통해 문서를 작성.");
	}

	@Override
	public void searchInternet() {
		System.out.println(this.internet +"를 통해 인터넷을 검색.");
	}

	@Override
	public void changeMode() {
		if(mode == 1) {
			System.out.println("NOTEBOOK_MODE -> TABLET_MODE");
			mode = 2;
		}else{
			System.out.println("TABLET_MODE -> NOTEBOOK_MODE");
			mode = 1;
		}
	}
	
	

}
