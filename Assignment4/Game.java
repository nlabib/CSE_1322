import java.util.ArrayList;
import java.util.Random;

public class Game extends Object{
	private ArrayList<Character> badGuys;
	Player player;
	Grunt numofGrunt;


	public Game(){
		Random rannumber = new Random();
		int num = rannumber.nextInt(1 ,2);
		System.out.println("Your facing " + num + " grunts");
		badGuys.add(Grunt);
	}
	public void win(){
		if()
	}
}
