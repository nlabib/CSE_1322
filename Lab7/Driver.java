import java.util.Scanner;

public class Driver{
	public static void main(String[] args){
		float num1 = 0;
		float num2 = 0;
		Scanner userin = new Scanner(System.in);
		int userC;
		Calculator cal = new Calculator();
		do{
			System.out.println("0 - Exit\n" + "1 - Addition\n" + "2 - Subtraction\n" + "3 - Multiplication\n" + "4 - Division");
			userC = userin.nextInt();
			System.out.println("Please enter the first number");
			num1 = userin.nextFloat();
			System.out.println("Please enter the second number");
			num2 = userin.nextFloat();
			switch(userC){
				case 0:
					break;
				case 1:
					System.out.println(cal.add(num1, num2));
					break;
				case 2:
					System.out.println(cal.subtract(num1, num2));
					break;
				case 3:
					System.out.println(cal.multiply(num1, num2));
					break;
				case 4:
					System.out.println(cal.divide(num1, num2));
					break;
			}
		}while(userC != 0);


	}
}
