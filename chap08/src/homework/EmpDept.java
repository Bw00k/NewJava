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
		System.out.println("이름 : " + getName() + " 연봉: " + getIncome() + " 부서: " + department);
	}

	@Override
	public void print() {
		System.out.println("수퍼클래스\n서브클래스");
	}
}
