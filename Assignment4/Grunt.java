import java.util.Random;

public class Grunt extends Character{
	static int gruntID;
	private int maxAttack = 5;

	public Grunt(){
		String gruntName = "Grunt" + gruntID;
		setName(gruntName);
		setHitPoint(100);
	}
	Random ranNumber = new Random();
	@Override
	public int attack(){
		int randomd = ranNumber.nextInt(0, maxAttack);
		System.out.println(name + " attacked you inflicting " + randomd);
		return randomd;
	}
}
