import java.util.Scanner;

public class Driver{
	public static void main(String[] args){
		Scanner userin = new Scanner(System.in);
		double ChekingBal;
		double Savings;
		System.out.print("Set Inital Balane of Checking Account: ");
		ChekingBal = userin.nextDouble();
		Checking checking = new Checking(ChekingBal);

		System.out.print("Set Initial Balance of Savings Account: ");
		Savings = userin.nextDouble();
		Savings savings = new Savings(Savings);

		Boolean userexit = true;

		do{
			System.out.println("1.Withdraw from Checking");
			System.out.println("2.Withdraw from savings");
			System.out.println("3.Deposit to Checkings");
			System.out.println("4.Deposit to Savings");
			System.out.println("5.Balance of Checking");
			System.out.println("6.Balance of Savings");
			System.out.println("7.Award Interest to savings now");
			System.out.println("8.Quit");
			System.out.println("Enter Your Choice : ");

			byte userinput = userin.nextByte();

			switch(userinput){
				case 1:{
					System.out.print("Enter amount to Withdraw: ");
					double w = userin.nextDouble();
					checking.withdrawal(w);
					break;
				}
				case 2:{
					System.out.print("Enter amount to Withdraw: ");
					double a = userin.nextDouble();
					savings.withdrawal(a);
					break;
				}
				case 3:{
					System.out.print("Enter amount to Deposit: ");
					double x = userin.nextDouble();
					checking.deposit(x);
					break;
				}
				case 4:{
					System.out.print("Enter amount to Deposit: ");
					double y = userin.nextDouble();
					savings.deposit(y);
					break;
				}
				case 5:{
					System.out.println("Account Balance is: $" + checking.getAccountBalance());
					break;
				}
				case 6:{
					System.out.println("Account Balance is: $" + savings.getAccountBalance());
					break;
				}
				case 7:{
					savings.adIntrest();
					break;
				}
				case 8:{
					System.out.println("Good Bye");
					userexit = false;
					break;
				}

			}
		}while(userexit);
		//this is test
	}
}
