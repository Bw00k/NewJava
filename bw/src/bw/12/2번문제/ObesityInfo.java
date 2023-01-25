package homeWork05_02;

public class ObesityInfo extends StandardWeightInfo{

	//생성자
	public ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
	}
	
	//메서드
	@Override
	public void getInformation() {
		String fat = null;
		if(getObesity() >= 25.0) { // 비만도가 25.0 이상이면 비만
			fat = "비만";
		}
		System.out.println(super.name+"님의 신장 " + super.height + ", 몸무게 " + super.weight + ", " + fat + "입니다.");
	}
	
	//비만도를 구하는 기능
	public double getObesity() {
		double obesity = (super.weight - super.getStandardWeight())/super.getStandardWeight() * 100;
		return obesity;
	}
	

}
