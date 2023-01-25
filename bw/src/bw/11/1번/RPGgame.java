package homeWork06_01;

public class RPGgame implements Keypad{
	
	// 필드
	private  int currentMode;
	
	// 생성자
	public RPGgame() {
		System.out.println("RPGgame 실행");
		this.currentMode = Keypad.NORMAL_MODE; // static필드
	}
	
	//메소드
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다.");
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다.");
	}

	@Override
	public void rightUpButton() {
		if(this.currentMode == Keypad.NORMAL_MODE) {
			System.out.println("캐릭터가 한칸단위로 점프한다.");
		}else if(this.currentMode == Keypad.HARD_MODE) {
			System.out.println("캐릭터가 두칸단위로 점프한다.");
		}
	}

	@Override
	public void rightDownButton() {
		if(this.currentMode == Keypad.NORMAL_MODE) {
			System.out.println("캐릭터가 일반 공격.");
		}else if(this.currentMode == Keypad.HARD_MODE) {
			System.out.println("캐릭터가 HIT 공격");
		}
	}

	@Override
	public void changeMode() {
		// 모드 바꾸기
		if(this.currentMode == Keypad.NORMAL_MODE) {
			
			this.currentMode = Keypad.HARD_MODE;
			System.out.println("현재모드 : HARD_MODE");
			
		}else if(this.currentMode == Keypad.HARD_MODE) {
			
			this.currentMode = Keypad.NORMAL_MODE;
			System.out.println("현재모드 : NORMAL_MODE");
			
		}
		
	}

}
