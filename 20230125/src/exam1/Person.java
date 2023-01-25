package exam1;

public class Person {
	private int ssn;
	private String name;
	private String address;
	
	Person(){
		
	}
	Person p1 = new Person();
	Person p2 = new Person();
	
	public Person(int ssn,String name, String address ) {
		this.ssn = ssn;
		this.name = name;
		this.address = address;
	}
	public void setInfo(int ssn, String name, String address) {
		this.ssn = ssn;
		this.name = name;
		this.address = address;
	}		
	public String getInfo() {
		return "Person [ ssn = " + this.ssn + ", name=" + this.name +", address= " + this.address +"]";	
		}
}
