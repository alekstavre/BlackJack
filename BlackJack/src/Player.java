import java.util.Scanner;

public class Player extends Person{
	public Scanner input;
	public Player() {
		super ();
		input = new Scanner (System.in);
		name = "Player";
	}

	int total = getTotal();
	
	@Override
	public boolean wantToHit() {

		System.out.print("hit or hold ?");

		while(true) {
	            String choice = input.next();
	            if (choice.equals("hit")) {
	                return true;
	            } else if (choice.equals("hold")) {
	                return false;
	            } else {
	                System.out.print("Type \"hit\" or \"stay\": ");
	            }
	        }
	}

}