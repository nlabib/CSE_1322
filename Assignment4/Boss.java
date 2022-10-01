import java.util.Random;

public class Boss extends Character{
	private int maxAttack = 10;

	public  Boss(){
		setName("Boss");
		setHitPoint(200);
	}

	Random ranNumber = new Random();


	@Override
	public int attack(){
		int randomd = ranNumber.nextInt(0, maxAttack);
		System.out.println(name + " attacked you inflicting " + randomd);
		return randomd;
	}
}
