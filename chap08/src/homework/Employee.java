package homework;

public class Employee {
	
	private String name;
	private int salary;
	
	
	public Employee(String name, int salary) {
		
		this.name = name;
		this.salary = salary;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void getInformation() {
		System.out.println("�̸� : " + name + "�μ� : " + salary);
	}
	
	public void print() {
		System.out.println("����Ŭ���� \n����Ŭ����");
	}
}
