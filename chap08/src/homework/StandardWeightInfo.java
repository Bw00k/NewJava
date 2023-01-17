package homework;

public class StandardWeightInfo extends Human {

	protected double standardWeight = getStandardWeight();

	public StandardWeightInfo(String name, double height, double weight) {
		super(name, height, weight);
	}

	@Override
	public void getInformation() {
		System.out.printf("%s���� ���� %3.0f, ������ %2.0f, ǥ��ü�� %4.1f �Դϴ�.\\n", name, height, weight,
				standardWeight);
	}

	public double getStandardWeight() {
		double standardWeight = ((height - 100) * 0.9);
		return standardWeight;
	}
}
