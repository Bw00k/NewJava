package homework;

public class Human_exe {

	public static void main(String[] args) {
		
		Human human;
		
		human = new StandardWeightInfo("ȫ�浿", 168, 45);
		human.getInformation();
		human = new ObesityInfo("�ڵ���", 168, 90);
		human.getInformation();
	}

}
