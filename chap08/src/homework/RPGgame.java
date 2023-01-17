package homework;

public  class RPGgame  implements Keypad{
	
	private int currentMode = NORMAL_MODE;
	
	public RPGgame() {
		System.out.println("RPGgame 실행");
	}
		
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다");
	}

	@Override
	public  void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다");
	}

	@Override
	public void rightUpButton() {
		System.out.println();
		- NORMAL_MODE : "캐릭터가 한칸단위로 점프한다."를 출력한다.
		- HARD_MODE : "캐릭터가 두칸단위로 점프한다."를 출력한다.
	}

	@Override
	public void rightDownButton() {
		System.out.println();
		- NORMAL_MODE : "캐릭터가 일반 공격."를 출력한다.
		- HARD_MODE : "캐릭터가 HIT 공격."를 출력한다.
	}

	@Override
	public void changeMode() {
		System.out.println();
	}
	

}
