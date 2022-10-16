import java.util.Scanner;

public class main{
	public static int recursive_mul(int n1, int n2){
		int sum = n1 * n2;
		return sum;
	}
	public static int recursive_div(int n1, int n2){
		int count = 0;
		if(n1 == 0 || n2 == 0){
			return -1;
		}
		else if(n1 == n2){
			return 1;
		}
		else if(n1 < n2){
			return 0;
		}
		else{
			while(n1 > n2){
				count++;
				n1 -= n2;
				recursive_div(n1, n2);
			}
		}
		return count;
	}

	public static int recursive_mod(int n1, int n2){
		int count = 0;
		if(n1 == 0 || n2 == 0){
			return -1;
		}
		else if(n1 < n2){
			return n1;
		}
		else{
			while(n1 > n2){
				n1 -= n2;
				count++;
				recursive_mod(n1, n2);
			}
			return n1;
		}
	}

	public static void main(String[] args){
		boolean stop = true;
		do{
			Scanner userin = new Scanner(System.in);
			System.out.println("\n0. Quit \n 1. Multiply 2 numbers \n 2. Div 2 numbers \n 3. Mod 2 numbers");
			int userch = userin.nextInt();
			if(userch == 0){
				stop = false;
			} else if(userch == 1){
				System.out.println("Enter first number: ");
				int num1 = userin.nextInt();
				System.out.println("Enter first number: ");
				int num2 = userin.nextInt();
				int result =  recursive_mul(num1, num2);
				System.out.println("Answer: " + result);
			}
			else if(userch == 2){
				System.out.println("Enter first number: ");
				int num1 = userin.nextInt();
				System.out.println("Enter first number: ");
				int num2 = userin.nextInt();
				int result = recursive_div(num1, num2);
				System.out.println("Answer: " + result);
			}
			else if(userch == 3){
				System.out.println("Enter first number: ");
				int num1 = userin.nextInt();
				System.out.println("Enter first number: ");
				int num2 = userin.nextInt();
				int result = recursive_mod(num1, num2);
				System.out.println("Answer: " + result);

			}
		}while(stop);

	}
}
