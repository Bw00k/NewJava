package homework;

public  class RPGgame  implements Keypad{
	
	private int currentMode = NORMAL_MODE;
	
	public RPGgame() {
		System.out.println("RPGgame ����");
	}
		
	@Override
	public void leftUpButton() {
		System.out.println("ĳ���Ͱ� �������� �̵��Ѵ�");
	}

	@Override
	public  void leftDownButton() {
		System.out.println("ĳ���Ͱ� �Ʒ������� �̵��Ѵ�");
	}

	@Override
	public void rightUpButton() {
		System.out.println();
		- NORMAL_MODE : "ĳ���Ͱ� ��ĭ������ �����Ѵ�."�� ����Ѵ�.
		- HARD_MODE : "ĳ���Ͱ� ��ĭ������ �����Ѵ�."�� ����Ѵ�.
	}

	@Override
	public void rightDownButton() {
		System.out.println();
		- NORMAL_MODE : "ĳ���Ͱ� �Ϲ� ����."�� ����Ѵ�.
		- HARD_MODE : "ĳ���Ͱ� HIT ����."�� ����Ѵ�.
	}

	@Override
	public void changeMode() {
		System.out.println();
	}
	

}
