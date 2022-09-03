import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
public class wordgame{
	private  int userInputCell = 4;
	private char[][] gameboard = new char[userInputCell][userInputCell];
	private boolean[][] revealShow;
	private int index;

//Constructor isn't working
	//Get the input for the user and check if the number is even.
/*
	public void setUserInputCell(){
		do{
			System.out.println("How big of a board (Enter an even number)?");
			Scanner userIn = new Scanner(System.in);
			this.userInputCell = userIn.nextInt();
		}while(userInputCell % 2 != 0);
	}
	public wordgame(){
		this.userInputCell = userinput;
	}
*/
	//using random generator to generate the board
	public  void fillBoard(){

		ArrayList<Character> wordbank = new ArrayList<>();
		//Generates A to Z in the wordbank arraylist
		for(char a = 'A'; a <= 'Z'; a++){
			wordbank.add(a);
		}
		Random random_number = new Random();
		for(int i = 0; i < gameboard.length; i++){
			for(int j = 0; j < gameboard.length; j++){
				// Filling the board
				index = random_number.nextInt(userInputCell/2);
				//Check if the location of the array is an open positon
				if(gameboard[i][j] == '\u0000'){
					gameboard[i][j] = wordbank.get(index);
					wordbank.remove(i);
				}
			}
		}
	}

	public void printBoard(){
		for(int i = 0; i < gameboard.length; i++){
			for(int j = 0; j < gameboard.length; j++){
				System.out.print(" | ");
				System.out.print(gameboard[i][j]);
			}
			System.out.print(" | ");
			System.out.println();
		}
	}

	//A method showPosition
	public void showPosition(int row, int colum){
		this.revealShow[row][colum] = true;
	}
	//A method hidPosition
	public void hidPositon(int row, int colum){
		this.revealShow[row][colum] = false;
	}
	//A method to show position
	public void allRevealed(){

	}



}
