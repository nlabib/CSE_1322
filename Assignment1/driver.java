import java.util.Scanner;

public class main{
    public static void main(String[] args){

        System.out.println("Enter gamebaord size");
        Scanner userin = new Scanner(System.in);
        int userinputnum = userin.nextInt();
        wordgame game1 = new wordgame(userinputnum);
        do{
            game1.printBoard();
            System.out.println("Row");
            int r = userin.nextInt();
            System.out.println("col");
            int c = userin.nextInt();
            game1.showPosition(r, c);
            game1.printBoard();
            //Is this sync
            




        }while(game1.allRevealed()==false);








        // set userinput cell
        // match if their is two words
        // store which array has been reveled
        // check if two values match if they do then keep them reveled
        // if all on the board has been reveld the say game done
        // end game loop
    }
}
