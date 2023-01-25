package homeWork06_01;

public class ArcadeGame implements Keypad {

	// 필드
	private int currentMode;

	// 생성자
	public ArcadeGame() {
		System.out.println("ArcadeGame 실행");
		this.currentMode = Keypad.NORMAL_MODE;
	}

	// 메소드
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 앞쪽으로 이동한다.");
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 뒤쪽으로 이동한다.");
	}

	@Override
	public void rightUpButton() {
		if (this.currentMode == Keypad.NORMAL_MODE) {
			System.out.println("캐릭터가 일반 공격");
		} else if (this.currentMode == Keypad.HARD_MODE) {
			System.out.println("캐릭터가 연속 공격");
		}
	}

	@Override
	public void rightDownButton() {
		if (this.currentMode == Keypad.NORMAL_MODE) {
			System.out.println("캐릭터가 HIT 공격");
		} else if (this.currentMode == Keypad.HARD_MODE) {
			System.out.println("캐릭터가 Double HIT 공격");
		}
	}

	@Override
	public void changeMode() {
		// 모드 바꾸기
		if (this.currentMode == Keypad.NORMAL_MODE) {

			this.currentMode = Keypad.HARD_MODE;
			System.out.println("현재모드 : HARD_MODE");

		} else if (this.currentMode == Keypad.HARD_MODE) {

			this.currentMode = Keypad.NORMAL_MODE;
			System.out.println("현재모드 : NORMAL_MODE");

		}
	}

}
