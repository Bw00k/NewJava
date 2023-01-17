package homework;

public class ObesityInfo extends StandardWeightInfo {

	private double obesity = getObesity();


	public ObesityInfo(String name, double height, double weight) {
		super(name, height, weight);
	}


	@Override
	public void getInformation() {
		if (obesity > 40) {
			System.out.printf("%s���� ���� %3.0f, ������ %2.0f, ���Դϴ�.\\n", name, height, weight);
		} else if(obesity>20) {
			System.out.printf("%s���� ���� %3.0f, ������ %2.0f, ��ü���Դϴ�.\\n", name, height, weight);
		} else if(obesity>0) {
			System.out.printf("%s���� ���� %3.0f, ������ %2.0f, ǥ��ü���Դϴ�.\\n", name, height, weight);
		} else {
			System.out.printf("%s���� ���� %3.0f, ������ %2.0f, ��ü���Դϴ�.\\n", name, height, weight);
		}
	}

	public double getObesity() {
		double obesity = (weight - standardWeight) / standardWeight * 100;
		return obesity;
	}
}
