package homework;

public class EmpDept extends Employee {

	private String department;

	public EmpDept(String name, int income, String department) {
		super(name, income);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public void getInformation() {
		System.out.println("�̸� : " + getName() + " ����: " + getIncome() + " �μ�: " + department);
	}

	@Override
	public void print() {
		System.out.println("����Ŭ����\n����Ŭ����");
	}
}
