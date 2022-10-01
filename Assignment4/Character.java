public abstract class Character{
protected int startingHitPoint = 0;
protected int currenthPoint = 0;
protected boolean alive;
protected  String name;
public Character(){
	alive = true;
}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setHitPoint(int hitPoint){
		this.startingHitPoint = hitPoint;
		this.currenthPoint = hitPoint;
	}



	public int health(){
		float heath = (currenthPoint / startingHitPoint) * 100;
		int current_healthP = (int) (100 - heath);
		return current_healthP;
	}
	public void takeHit(int damage){
		System.out.println((name + " has been hit with " + damage + " damage"));
		if(currenthPoint < 0 || startingHitPoint < 0){
			setHitPoint(0);
			if(currenthPoint < 0){
				System.out.println(name + " has Died");
				alive = false;
			}
		}
		else {
			currenthPoint -= damage;
			startingHitPoint -= damage;
			System.out.println(name + " now has health of" + currenthPoint);
		}
	}
	public boolean isAlive(){
		if(alive == true){
			return true;
		}
		else{
			return false;
		}
	}
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
public abstract int attack();

}
