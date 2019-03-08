
public class Dealer extends Person{
	
	public Dealer() {
		super();
		name = "Dealer";
	}
	
	int total = getTotal();
		
	@Override
	public boolean wantToHit() {
		 if (total < 16) return true;
		return false;
	}

}
