package co.micol.test.card;

public class card {
	String cardNo;
	int validDate;
	int cvc;
	
	public card(String cardNo) {
		this.cardNo = cardNo;
	}
	
	public card(String cardNo, int validDate, int cvc) {
		super();
		this.cardNo = cardNo;
		this.validDate = validDate;
		this.cvc = cvc;
	}
	
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public int getValidDate() {
		return validDate;
	}
	public void setValidDate(int validDate) {
		this.validDate = validDate;
	}
	public int getCvc() {
		return cvc;
	}
	public void setCvc(int cvc) {
		this.cvc = cvc;
	}

	public void showCardInfo() {
		System.out.println("(cardNo : " + cardNo + ", 유효기간 : " + validDate + ", CVC : " + cvc + " )");
	}

	
}
