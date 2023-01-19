package Q2;

public class PortableNotebook implements Notebook,Tablet {
	//필드
	int mode;
	String docProgram;
	String internet;
	String video;
	String app;
		
	//생성자
	public PortableNotebook(String docProgram,String internet,String video,String app) {
		mode = NOTEBOOK_MODE;	
		this.docProgram = docProgram;
		this.internet = internet;
		this.video = video;
		this.app = app;
		System.out.println("NOTEBOOK_MODE");
	}
	
	
	
	
	
	
	
	//메소드
	@Override
	public void watchVideo() {
		System.out.println(video+"를 시청.");
		
	}

	@Override
	public void useApp() {
		if(mode == NOTEBOOK_MODE) {
			mode = TABLET_MODE;
			System.out.println(app+"를 실행");
		}
		
		
	}

	@Override
	public void writeDocumentaion() {
		System.out.println(docProgram+"을 통해 문서를 작성.");
		
	}

	@Override
	public void searchInternet() {
		System.out.println(internet+"를 통해 인터넷을 검색.");
		
	}
	public void changeMode() {
		if(mode == NOTEBOOK_MODE) {
			mode = TABLET_MODE;
			System.out.println("TABLET_MODE");
		}else if(mode == TABLET_MODE) {
			mode = NOTEBOOK_MODE;
			System.out.println("NOTEBOOK_MODE");
		}
	}

}
