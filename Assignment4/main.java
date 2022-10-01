public class main{
	public static void main(String[] args){
		Game myGame=new Game();
		while((!myGame.win()) && (!myGame.lose())) {
			myGame.playRound();
			System.out.println(); //Change this to a printline in your language.
		}
	}
}
