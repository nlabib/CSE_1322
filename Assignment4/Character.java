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
	public String takeHit(int damage){
		return (name + " has been hit with " + damage + " damage");
		
	}


}
