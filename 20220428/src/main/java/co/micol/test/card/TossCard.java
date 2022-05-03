package co.micol.test.card;

public class TossCard extends card{
	String company = "Toss";
	String cardStaff;
	
	public TossCard(String cardNo, String cardStaff) {
		super(cardNo);
		this.cardStaff = cardStaff;
	}
	
	public void showCardInfo() {
		System.out.println("카드정보 - Card No, " + cardNo + "\n" 
				+ "담당직원 - " + cardStaff + ", " + company);
	}
	
	
}
