package homework;

public interface Keypad  {
	
	 public static final int NORMAL_MODE = 0;
	 public static final int HARD_MODE = 1;
	 
	 
	 
	 	public abstract void leftUpButton(); //: ���ʿ��� ���� ��ư�� ������ �� �����ϴ� ���}
		public abstract void leftDownButton(); //: ���ʿ��� �Ʒ��� ��ư�� ������ �� �����ϴ� ���
		public abstract void rightUpButton(); //: �����ʿ��� ���� ��ư�� ������ �� �����ϴ� ���
		public abstract void rightDownButton(); //: �����ʿ��� �Ʒ��� ��ư�� ������ �� �����ϴ� ���
		public abstract void changeMode(); //: ��带 �ٲٰ� ���� ��带 ����ϴ� ��� ( NORMAL_MODE -> HARD_MODE / HARD_MODE -> NORMAL_MODE)
}
