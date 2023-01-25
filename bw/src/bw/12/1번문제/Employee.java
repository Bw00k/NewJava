package homeWork05_01;

public class Employee {

	//필드
	private String name; // 이름
	private int pay; // 연봉
	
	//생성자
	public Employee(String name, int pay) {
		this.name = name;
		this.pay = pay;
	}
	
	//메소드
	// getter
	public String getName() {
		return this.name;
	}
	public int getPay() {
		return this.pay;
	}
	
	// 이름과 연봉을 출력하는 기능
	public void getInformation() {
		System.out.println("이름 : " + this.name + ", 연봉: " + this.pay);
	}
	
	public void print() {
		System.out.println("수퍼클래스");
	}
	
}
