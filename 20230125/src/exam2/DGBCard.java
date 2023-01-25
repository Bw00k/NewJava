package exam2;

public class DGBCard extends Card{
	String company;
	String cardStaff;
	
	DGBCard(String cardNo, int validDate, int cvc, String cardStaff) {
		super(cardNo, validDate, cvc);
		this.cardStaff = cardStaff;
		this.company = "대구은행";
		// TODO Auto-generated constructor stub
	}
	
	public String getCompany() {
		return company;
	}
	public String getCardStaff() {
		return cardStaff;
	}

	@Override
	public void showCardInfo() {
		// TODO Auto-generated method stub
		super.showCardInfo();
		System.out.println("담당직원 - " + cardStaff +", "+ company);
	}
	
	
	
	
}
