package homework;

public class StandardWeightInfo extends Human {

	protected double standardWeight = getStandardWeight();

	public StandardWeightInfo(String name, double height, double weight) {
		super(name, height, weight);
	}

	@Override
	public void getInformation() {
		System.out.printf("%s님의 신장 %3.0f, 몸무게 %2.0f, 표준체중 %4.1f 입니다.\\n", name, height, weight,
				standardWeight);
	}

	public double getStandardWeight() {
		double standardWeight = ((height - 100) * 0.9);
		return standardWeight;
	}
}
