package exam3;

public class SimplePayment implements Payment {
	double simplePaymentRatio;
	
	SimplePayment(double simplePaymentRatio){
		this.simplePaymentRatio = simplePaymentRatio;
	}

	@Override
	public int online(int price) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int offline(int price) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		
	}
}
