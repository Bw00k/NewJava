package com.yedam.java.day0117_2;

public class Main {

	public static void main(String[] args) {
		PortableNotebook pn = new PortableNotebook(
				"한글2020", "크롬", "영화", "안드로이드앱");
		pn.writeDocumentaion();
		pn.watchVideo();
		pn.changeMode();
		pn.useApp();
		pn.searchInternet();

	}

}
