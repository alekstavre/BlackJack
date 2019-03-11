import java.util.ArrayList;

public class BlackJack {

	public static ArrayList<Person>players;

	public BlackJack() {
        startGame();
        takeTurns();
    }
	
	public static void main(String[] args) {
		BlackJack game = new BlackJack();
	}

	public static void startGame() {
		
			
			System.out.println("let's play!");
			players = new ArrayList<Person>();
			players.add(new Player());
			players.add(new Dealer());
			
	}
	
	private static void takeTurns() {
		
		for (Person player: players) {
            boolean endOfTurn = false;
            while(!endOfTurn) {
            	System.out.println("it's " + player.getName()+"'s  turn");
                player.getCard();
                boolean hit = player.wantToHit();
                if (hit) {
                    player.getCard();
                    System.out.println(player.getName() + " drew:");
                    if (player.getTotal() > 21) {
                        endOfTurn = true;
                        System.out.println(player.getName() + " lost.");
                    }
                } else {
                    endOfTurn = true;
                    System.out.println(player.getName() + " stayed.");
                }
            }
        }
		
	}

}