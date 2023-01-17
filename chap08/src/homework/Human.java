package homework;

public class Human {
	
	protected String name;
	protected double height;
	protected double weight;

	
	public Human(String name, double height, double weight) {
		this.name =name;
		this.height = height;
		this.weight = weight;
	}

	
	public void getInformation() {
		System.out.println("이름" + name + "키" + height + "몸무게" + weight);
	}
}
