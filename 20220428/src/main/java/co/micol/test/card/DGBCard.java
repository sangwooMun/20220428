package co.micol.test.card;

public class DGBCard extends card{
	String company = "대구은행";
	String cardStaff;
	
	
	
	public DGBCard(String cardNo, int validDate, int cvc, String cardStaff) {
		super(cardNo, validDate, cvc);
		this.cardStaff = cardStaff;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCardStaff() {
		return cardStaff;
	}
	public void setCardStaff(String cardStaff) {
		this.cardStaff = cardStaff;
	}
	
	public void showCardInfo() {
		System.out.println("카드정보 (Card NO : " + cardNo + ", 유효기간 : " + validDate + ", CVC : " + cvc + ")\n"
							+ "담당직원 - " + cardStaff + ", " + company);
	}
}
