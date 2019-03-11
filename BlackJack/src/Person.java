
public abstract class Person{

	public String name;
	public int  total;

	public abstract boolean wantToHit();

	public int getCard() {
		int card = 2 + (int)(Math.random() * ((12 - 2) + 1));
		System.out.println("drew the card: " + card);
		total += card;
		System.out.println("the total is : " + total);
		return card;
	}	

	public int getTotal() {
		return total;
	
	}

	public String getName() {
		return name;
	}

}
