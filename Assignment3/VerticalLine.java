public class VerticalLine extends line{
	public VerticalLine(int sX, int sY, int l){
		super(sX, sY, l);
		theCharacter = '|';
	}

	@Override
	public boolean onLine(int x, int y){
		if(this.start_y != y){
			return false;
		}
		if(this.start_x > x || x > this.start_x + length -1){
			return false;
		}
		return true;
	}
}