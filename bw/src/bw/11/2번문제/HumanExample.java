package homeWork05_02;

public class HumanExample {

	public static void main(String[] args) {
		
		Human human = new StandardWeightInfo("홍길동",168,45); // 자동타입변환
		human.getInformation();
		
		human = new ObesityInfo("박둘이",168, 90); // 자동타입변환
		human.getInformation();
		
		
	}

}
