
public class BlackJack {

	public static void startGame() {

		System.out.println("let's play!");

		Dealer dealer = new Dealer();
		Player mrWho = new Player();

		dealer.getCard();
		mrWho.getCard();
		
		
	}
}