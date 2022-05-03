package co.micol.test.card;

public class cardmain {
	public static void main(String[] args) {
		
//		card cd = new card("5432-2456-9534-3657", 20251203, 253);
//		cd.showCardInfo();
		
		
		TossCard ts = new TossCard("5432-4567-9534-3657", "신빛용");
		ts.showCardInfo();
		
		DGBCard dc = new DGBCard("5432-4567-9534-3657", 20251203, 253, "신빛용");
			dc.showCardInfo();
		
	}
}
