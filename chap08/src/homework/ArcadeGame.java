package homework;

public class ArcadeGame implements Keypad {
	
	private int currentMode = NORMAL_MODE;
	
	public ArcadeGame() {
		System.out.println("ArcadeGame ����");
	
	
	
	}

	@Override
	public void leftUpButton() {
		// TODO Auto-generated method stub
		System.out.println("ĳ���Ͱ� �������� �̵��Ѵ�");
	}

	@Override
	public void leftDownButton() {
		// TODO Auto-generated method stub
		System.out.println("ĳ���Ͱ� �������� �̵��Ѵ�");
	}

	@Override
	public void rightUpButton() {
		// TODO Auto-generated method stub
		- NORMAL_MODE : "ĳ���Ͱ� �Ϲ� ����"�� ����Ѵ�.
		- HARD_MODE : "ĳ���Ͱ� ���� ����"�� ����Ѵ�.
	}

	@Override
	public void rightDownButton() {
		// TODO Auto-generated method stub
		- NORMAL_MODE : "ĳ���Ͱ� HIT ����."�� ����Ѵ�.
		- HARD_MODE : "ĳ���Ͱ� Double HIT ����."�� ����Ѵ�.
	}

	@Override
	public void changeMode() {
		// TODO Auto-generated method stub
		
	}
}