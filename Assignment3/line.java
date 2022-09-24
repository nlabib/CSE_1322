public abstract class line{
	protected int start_x;
	protected int start_y;
	protected int length;
	protected char theCharacter;
	public line(int sX, int sY, int l){
		this.start_x = sX;
		this.start_y = sY;
		this.length = l;
	}

	public char getTheCharacter(){
		return theCharacter;
	}

	//Abstract Class
	public abstract boolean onLine(int x, int y);

}
