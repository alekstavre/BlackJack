
public class Dealer extends Person{
	
	public Dealer() {
		super();
		name = "Dealer";
	
	}
	
	int total = getTotal();
	
	@Override
	public void getCard() {
		
		if (total > 17) {
			boolean wantToHitD = false;
		}
	}
		
	@Override
	public boolean wantToHit() {
		 if (total < 17) return true;
		return false;
	}

}
