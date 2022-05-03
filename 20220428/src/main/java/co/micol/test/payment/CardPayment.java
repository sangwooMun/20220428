package co.micol.test.payment;

public class CardPayment implements payment {
	double cardRatio;

	
	public CardPayment(double cardRatio) {
		super();
		this.cardRatio = cardRatio;
	}
	
	@Override
	public int online(int price) {
			price = (int) (price * (ONLINE_PAYMENT_RATIO + cardRatio));
			
		return price;
	}

	@Override
	public int offline(int price) {
		price = (int) (price * (OFFLINE_PAYMENT_RATIO + cardRatio));
		return price;
	}

	@Override
	public void showInfo() {
		System.out.println("*** 간편결제 시 할인정보");
		System.out.println("온라인 결제시 총 할인율 : " + (ONLINE_PAYMENT_RATIO + cardRatio));
		System.out.println("오프라인 결제시 총 할인율 : " + (OFFLINE_PAYMENT_RATIO + cardRatio));
	}

}
