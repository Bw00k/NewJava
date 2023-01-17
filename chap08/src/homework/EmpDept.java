package homework;

public class EmpDept extends Employee {

	private String department;

	public EmpDept(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public void getInformation() {
		System.out.println("�̸� : " + getName() + " ����: " + getSalary() + " �μ�: " + department);
	}

	@Override
	public void print() {
		System.out.println("����Ŭ����\n����Ŭ����");
	}
}
