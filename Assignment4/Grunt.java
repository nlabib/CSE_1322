import java.util.Random;

public class Grunt extends Character{
	static int gruntID;
	private int maxAttack = 5;
	private int gnum = 0;

	public Grunt(){
		gnum = ++gruntID;
		String gruntName = "Grunt" + gnum;
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
