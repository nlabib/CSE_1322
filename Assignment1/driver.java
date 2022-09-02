import java.util.Scanner;

public class main{
    public static void main(String[] args){
        wordgame game1 = new wordgame();

        Scanner userin = new Scanner(System.in);
        System.out.println("How big of a board (Enter an even number)?");
        int input = userin.nextInt();

        game1.setUserInputCell(input);

        game1.fillBoard();
        game1.printBoard();


        // set userinput cell
        // match if their is two words
        // store which array has been reveled
        // check if two values match if they do then keep them reveled
        // if all on the board has been reveld the say game done
        // end game loop
    }
}
