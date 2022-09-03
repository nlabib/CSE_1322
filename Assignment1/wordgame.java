import java.util.Random;
import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.Scanner;
public class wordgame{
	private int userInputCell;
	private char[][] gameboard;
	private boolean[][] revealShow;
	private int index;

	//Constructor isn't working
	//Get the input for the user and check if the number is even.
	Scanner userInput = new Scanner(System.in);



	 public wordgame(int input){
		if(input%2==0){
			this.userInputCell = input;
			revealShow= new boolean[userInputCell][userInputCell];
			gameboard = new char[userInputCell][userInputCell];
			fillBoard();
		}
		else{
			System.out.println("Dimensions must be even");
			return;
		}
		
		
	}
	 

	
	//using random generator to generate the board

	public  void fillBoard(){
		char myLetter='A';
		int whenToChange=0;
		Random myRand= new Random();
		do{
			int r=myRand.nextInt(gameboard.length);
			int c=myRand.nextInt(gameboard.length);
			if(gameboard[r][c]=='\u0000'){
				gameboard[r][c]=myLetter;
				whenToChange++;
				if(whenToChange%2==0){
					myLetter++;
				}
			}
		}while(whenToChange<gameboard.length*gameboard.length);
		
	}

	public void printBoard(){
		// Check if its false or not
		for(int i = 0; i < gameboard.length; i++){
			for(int j = 0; j < gameboard.length; j++){
				System.out.print(" | ");
				if(revealShow[i][j] == true){
					System.out.print(gameboard[i][j]);
				}
				
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
	public boolean allRevealed(){
		for(int i=0; i< gameboard.length; i++){
			for(int j = 0; j < gameboard[0].length; j++){
				if(revealShow[i][j] == false){
					return false;
				}
				
			}
		}
		return true;
	

	}



}

