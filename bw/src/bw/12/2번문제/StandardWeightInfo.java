package homeWork05_02;

public class StandardWeightInfo extends Human{

	// 생성자
	public StandardWeightInfo(String name, int height, int weight) {
		super(name, height, weight);
	}

	//메소드
	
	// 표준체중을 구하는 기능
	public double getStandardWeight() {
		return (super.height - 100) * 0.9;
	}
	
	@Override
	public void getInformation() {
		System.out.println(super.name+"님의 신장 " + super.height + ", 몸무게 " + super.weight + ", 표준체중 " + getStandardWeight() + "입니다.");
	}
	
	
	
	
	
}
