package co.micol.test.payment;

public class SimplePayment implements payment{
	double simplePaymentRatio;

	public SimplePayment(double simplePaymentRatio) {
		super();
		this.simplePaymentRatio = simplePaymentRatio;
	}

	
	@Override
	public int online(int price) {
		price = (int) (price * (ONLINE_PAYMENT_RATIO + simplePaymentRatio));
		return price;
	}

	@Override
	public int offline(int price) {
		price = (int) (price * (OFFLINE_PAYMENT_RATIO + simplePaymentRatio));
		return price;
	}

	@Override
	public void showInfo() {
		System.out.println("*** 간편결제 시 할인정보");
		System.out.println("온라인 결제시 총 할인율 : " + (ONLINE_PAYMENT_RATIO + simplePaymentRatio));
		System.out.println("오프라인 결제시 총 할인율 : " + (OFFLINE_PAYMENT_RATIO + simplePaymentRatio));
	}
	
	

}
