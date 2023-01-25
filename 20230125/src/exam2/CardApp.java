package exam2;

public class CardApp {
	public static void main(String[] args) {
		Card c1 = new Card();
		
		c1.showCardInfo();
		
		TossCard t1 = new TossCard("신빛용");
		
		System.out.println("카드정보 - Card NO, " + t1.cardNo);
		System.out.println("담당직원 - " + t1.cardStaff +", "+ t1.company);
		
		
		
	}
}
