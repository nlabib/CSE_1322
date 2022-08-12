/*
Class: CSE 1322L
Section: w2
Term: Fall 2022
Instructor: Kavitha Muppa
Name: Nasimul Labib
Lab#: Assignment4A
*/
import com.sun.security.jgss.GSSUtil;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        int input = 0;
        StockItem milk = new StockItem("1 Gallon of milk", 3.60f, 15);
        StockItem bread = new StockItem("1 Loaf of Bread", 1.98f, 30);
        Scanner userinput = new Scanner(System.in);
        boolean input_x = false;

        while(input_x != true){
            System.out.println("1. Sold One Milk");
            System.out.println("2. Sold One Bread");
            System.out.println("3. Change price of Milk");
            System.out.println("4. Change price of Bread");
            System.out.println("5. Add Milk to Inventory");
            System.out.println("6. Add Bread to Inventory");
            System.out.println("7. See Inventory");
            System.out.println("8. Quit");
            int input1 = userinput.nextInt();

            switch (input1) {
                case 1: {
                    milk.lowerQuntatiy(1);
                    break;
                }
                case 2: {
                    bread.lowerQuntatiy(1);
                    break;
                }
                case 3: {
                    System.out.println("What is the new price of Milk");
                    float price = 0;
                    price = userinput.nextFloat();
                    milk.setNewPrice(price);
                    break;
                }
                case 4: {
                    System.out.println("What is the new price of Milk");
                    float price = 0;
                    price = userinput.nextFloat();
                    bread.setNewPrice(price);
                    break;
                }
                case 5: {
                    System.out.println("How many milk did we get? ");
                    int q = 0;
                    q = userinput.nextInt();
                    milk.raiseQuntatiy(q);
                    break;
                    }
                case 6: {
                    System.out.println("How many bread did we get? ");
                    int q = 0;
                    q = userinput.nextInt();
                    bread.raiseQuntatiy(q);
                    break;
                }
                case 7: {
                    System.out.println("\n"+milk+"\n"+"\n"+bread);
                    break;
                }
                case 8:{
                    input_x = true;
                    break;
                }
            }
        }
    }
}
