import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;

public class wordgame{
	//private char[][] gameboard;

	private boolean[][] revealShow;
	private  int userInputCell = 10;

	private static int index;

//fix so it takes in input correcly
	public void setUserInputCell(int userInputCell){
		if(userInputCell % 2 == 0){
			this.userInputCell = userInputCell;
		} else{
			System.out.println("Input a even number: ");
		}
	}



	char[][] gameboard = new char[userInputCell][userInputCell];

	//using random generator to generate the board
	public  void fillBoard(){
		char[] charbank = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		Random random_number = new Random();
		for(int i = 0; i < gameboard.length; i++){
			for(int j = 0; j < gameboard.length; j++){
				// Filling the board
				index = random_number.nextInt(charbank.length);
				gameboard[i][j] = charbank[index];
			}
		}

	}

	public void printBoard(){
		for(int i = 0; i < gameboard.length; i++){
			for(int j = 0; j < gameboard.length; j++){
				System.out.print(gameboard[i][j]);
				System.out.print(" | ");
			}
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
