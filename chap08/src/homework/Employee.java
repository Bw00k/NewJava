package homework;

public class Employee {
	
	private String name;
	private int income;
	
	
	public Employee(String name, int income) {
		
		this.name = name;
		this.income = income;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getIncome() {
		return income;
	}
	
	public void getInformation() {
		System.out.println("�̸� : " + name + "�μ� : " + income);
	}
	
	public void print() {
		System.out.println("����Ŭ���� \n����Ŭ����");
	}
}
