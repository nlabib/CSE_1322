import java.util.Scanner;

public class main{
	public static void main(String[] args){
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter the number you want to find the Fibonacci series for");
		int user_in = userin.nextInt();

		FibLteration fibIteration = new FibLteration();
		FibFormula fibFormula = new FibFormula();
		System.out.println("Fib of " + user_in + " by iteration is: " + fibIteration.calculate_fib(user_in));
		System.out.println("Fib of " + user_in + " by iteration is: " + fibFormula.calculate_fib(user_in));

	}
}
