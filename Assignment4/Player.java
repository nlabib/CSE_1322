import java.util.Random;

public class Player extends Character{
	public Player(){
		setName("Player 1");
		setHitPoint(100);
	}
	Random ranNumber = new Random();
	@Override
	public int attack(){
		int randomd = ranNumber.nextInt(0, 30);
		System.out.println(name + " attacked you inflicting " + randomd);
		return randomd;
	}

	@Override
	public void displayYourself(){
		System.out.println(name + " Health: " + health() + " %");
		int displaybar = 100 / health();
		for(int i  = 0; i < 10; i++){
			if(i < displaybar){
				System.out.print("=");
			}
			else{
				System.out.print("_");
			}
		}

	}
}
