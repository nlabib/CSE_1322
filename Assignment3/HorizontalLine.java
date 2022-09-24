public class HorizontalLine extends line{

	public HorizontalLine(int sX, int xY, int l){
		super(sX, xY , l);
		theCharacter = '-';
	}
	@Override
	public boolean onLine(int x, int y){
		if(this.start_x != x){
			return false;
		}
		if(this.start_y > y || this.start_y + length - 1 < y){
			return false;
		}
		return true;
	}
}
