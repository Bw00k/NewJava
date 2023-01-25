package exam2;

public class Card {
	String cardNo;
	int validDate;
	int cvc;
	

	
	Card (String cardNo, int validDate, int cvc) {
		this.cardNo = cardNo;
		this.validDate = validDate;
		this.cvc =cvc;
	}
	
	public String getcardNo() {
		return this.cardNo;
	}
	public int getvalidDate() {
		return this.validDate;
	}
	public int getcvc() {
		return this.cvc;
	}
	public void showCardInfo() {
		System.out.println("cardNo: " + this.cardNo+", " + "유효기간: " + this.validDate+", " + "cvc: "+ this.cvc);
	}
}


