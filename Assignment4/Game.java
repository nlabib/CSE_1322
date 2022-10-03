import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game extends Object{
	private ArrayList<Character> badGuys= new ArrayList<>();
	Player player;
	Grunt numofGrunt;


	public Game(){
		Random rannumber = new Random();
		int num = rannumber.nextInt(1 ,3);
		System.out.println("Your facing " + num + " grunts");
		for(int i=0; i<num; i++){
			badGuys.add(new Grunt());
		}
		badGuys.add(new Boss());
		player= new Player();

	}
	public boolean win(){
		for(int i = 0; i < badGuys.size(); i++){
			if(badGuys.get(i).isAlive() == true){
				return false;
			}
		}
		return true;
	}

	public boolean lose(){
		if(player.isAlive() == false){
			return true;
		}
		else{
			return false;
		}
	}
	public int chooseWhoToAttack(){
		System.out.println("Who would you like to attack? ");
		for(int i=0; i<badGuys.size(); i++){
			if(badGuys.get(i).alive == true){
				System.out.println(i+ ". " +badGuys.get(i).getName());
			}
		}
		Scanner userin = new Scanner(System.in);
		int whoattack = userin.nextInt();
		return whoattack;
	}
	public void playRound(){
		player.displayYourself();
		for(int i = 0; i < badGuys.size(); i++){
			if(badGuys.get(i).isAlive()){
				badGuys.get(i).displayYourself();
				player.takeHit(badGuys.get(i).attack());
			}

		}
		if(player.isAlive()){

			badGuys.get(chooseWhoToAttack()).takeHit(player.attack());
		}


	}

}
