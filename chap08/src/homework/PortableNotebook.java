package homework;

public class PortableNotebook implements Tablet, Notebook {

	private int mode = NOTEBOOK_MODE;
	private String document;
	private String browser;
	private String video;
	private String app;

	public PortableNotebook(String document, String browser, String video, String app) {
		mode = NOTEBOOK_MODE;
		this.document = document;
		this.browser = browser;
		this.video = video;
		this.app = app;
		System.out.println("NOTEBOOK_MODE");
	}

	@Override
	public void writeDocumentation() {
		System.out.println(document + "을 통해 문서를 작성.");

	}

	@Override
	public void searchInternet() {
		System.out.println(browser + "를 통해 인터넷을 검색.");

	}

	@Override
	public void watchVideo() {
		System.out.println(video + "를 시청.");

	}

	@Override
	public void useApp() {
		if (mode == NOTEBOOK_MODE) {
			mode = TABLET_MODE;
			System.out.println(app + "를 실행");
		}
	}

}
