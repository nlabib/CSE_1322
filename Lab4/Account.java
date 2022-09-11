public abstract class Account{
	static private double accountNumber;
	static private double accountBalance;
	private static int accountCount = 0000;

	public Account(){
		this.accountNumber = accountCount++;
		accountBalance = 0;
	}
	public Account(double startBal){
		accountBalance = startBal;
	}
	public static double getAccountNumber(){
		return accountNumber;
	}
	public static double getAccountBalance(){
		return accountBalance;
	}
	public static void setAccountBalance(double abal){
		accountBalance = abal;
	}
	public void withdrawal(double withd){
		accountBalance  -= withd;
	}
	public void deposit(double des){
		accountBalance += des;
	}

}
