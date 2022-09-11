public class Checking extends Account{

	 public Checking(double initialBalance){
		 super(initialBalance);
	 }

	@Override
	public void withdrawal(double amount){
		 super.withdrawal(amount);
		 if(getAccountBalance() <= 0){
			 System.out.println("Charging an overdraft fee of $20 because account is below $0");
			 setAccountBalance(getAccountBalance()-10);
		 }
	}


}
