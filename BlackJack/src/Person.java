
public abstract class Person{

	public  String name;
	public int  total;

	public abstract boolean wantToHit();

	public void getCard() {
		int card = 2 + (int)(Math.random() * ((12 - 2) + 1));
		System.out.println(name + " draw : " + card);
		total += card;
		System.out.println(name + " sum is : " + total);
	}	

	public int getTotal() {
		return total;
	
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}



}
