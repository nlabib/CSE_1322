import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.Random;

public class FakeCharacter{
	private char[][] drawChar;
	private int size;

	ArrayList<line> Line = new ArrayList<line>();
	Random randNumber = new Random();

	public FakeCharacter(int x, int y){
		size=x;
		drawChar= new char[size][size];
		makePath(y);
		for(int i =0; i < size; i++){
			for(int j = 0; j < size; j++){
				for(int g = 0; g < Line.size(); g++){
					if(Line.get(g).onLine(i, j)){
						drawChar[i][j]=Line.get(g).getTheCharacter();
					}
				}
			}
		}
		addCircle(4);
	}
	public void makePath(int numberOfPath){
		for(int i = 1; i <= numberOfPath; i++){
			int start_x, start_y, length = 0;
			start_x=randNumber.nextInt(size);
			start_y=randNumber.nextInt(size);
			length=randNumber.nextInt(size);
			int choice=randNumber.nextInt(2);
			if(choice==0){
				Line.add(new HorizontalLine(start_x, start_y, length));
			}
			else{
				Line.add(new VerticalLine(start_x, start_y, length));
			}
			
		}
	}
	public void addCircle(int numOFC){
		for(int i=0; i<numOFC; i++){
		int x = randNumber.nextInt(size);
		int y = randNumber.nextInt(size);
		drawChar[x][y]='o';
		}
	}

	public void printCharacter(){
			for(int i =0; i < size; i++){
				for(int j = 0; j < size; j++){
					if(drawChar[i][j] == '\u0000'){
						System.out.print(" ");
					}
					else{
						System.out.print(drawChar[i][j]);
					}
				}
				System.out.println();
			}
	}
}
