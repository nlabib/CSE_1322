import java.util.Scanner;

public class main{


    public static void main(String[] args){

        System.out.print("Enter Gameboard size: ");
        Scanner userin = new Scanner(System.in);
        int userinputnum = userin.nextInt();
        wordgame game1 = new wordgame(userinputnum);

        //game loop
        do{
            game1.printBoard();

            //First input
            System.out.print("Enter First Row: ");
            int rowInput = userin.nextInt();
            while(rowInput >= game1.getUserInputCell()){
                System.out.println("Enter a value between 0 and" + (game1.getUserInputCell() - 1));
                System.out.print("Enter First Row");
                rowInput = userin.nextInt();
            }
            System.out.print("Enter First column: ");
            int columnInput = userin.nextInt();
            while(columnInput >= game1.getUserInputCell()){
                System.out.println("Enter a value between 0 and" + (game1.getUserInputCell() - 1));
                System.out.print("Enter First column");
                columnInput = userin.nextInt();
            }

            game1.showPosition(rowInput, columnInput);
            game1.printBoard();

            // Second Input
            System.out.print("Enter Second Row: ");
            int rowInput1 = userin.nextInt();
            while(rowInput1 >= game1.getUserInputCell()){
                System.out.println("Enter a value between 0 and" + (game1.getUserInputCell() - 1));
                System.out.print("Enter Second Row");
                rowInput1 = userin.nextInt();
            }
            System.out.print("Enter Second column: ");
            int columnInput2 = userin.nextInt();
            while(columnInput2 >= game1.getUserInputCell()){
                System.out.println("Enter a value between 0 and" + (game1.getUserInputCell() - 1));
                System.out.print("Enter Second column");
                columnInput2 = userin.nextInt();
            }

            game1.showPosition(rowInput1, columnInput2);
            game1.printBoard();

            if(game1.match(rowInput, columnInput, rowInput1, columnInput2)){
                System.out.println("Thats a match!");
                game1.allRevealed();
            }else{
                System.out.println("Thats a miss");
                game1.hidPositon(rowInput, columnInput);
                game1.hidPositon(rowInput1, columnInput2);
            }


        }while(! game1.allRevealed());
        System.out.println("You Own!");

        // set userinput cell
        // match if their is two words
        // store which array has been reveled
        // check if two values match if they do then keep them reveled
        // if all on the board has been reveld the say game done
        // end game loop
    }
}
