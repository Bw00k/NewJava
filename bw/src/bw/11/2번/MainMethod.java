package homeWork06_02;

public class MainMethod {
	
	public static void main(String[] args) {
		PortableNotebook pn = new PortableNotebook("한글2020", "크롬", "영화", "안드로이드앱");
		pn.writeDocumentaion();
		pn.watchVideo();
		pn.useApp();
		pn.searchInternet();
	}
}
