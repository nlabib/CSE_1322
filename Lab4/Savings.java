public class Savings extends Account{
	public int depositeCount =0;
	public Savings(double Bal){
		super(Bal);
	}
	@Override
	public void withdrawal(double amt){
		if(getAccountBalance()>= amt){
			super.withdrawal(amt);
			if(getAccountBalance()<500){
				System.out.println("Charging a fee of $10 because you are below $500");
				setAccountBalance(getAccountBalance()-10);
			}
			else{
				System.out.println("You dont have money in your accoiunt");
			}

		}
	}
		@Override
		public void deposit(double des){
			super.deposit(des);
			this.depositeCount++;
			System.out.println("This is deposit" + this.depositeCount + "to this account");
			if(this.depositeCount >=5){
				System.out.println("Charging a fee of $10");
				setAccountBalance(getAccountBalance()-10);
		}
	}
	public void adIntrest(){
		double intrest = getAccountBalance()*1.5/100;
		System.out.println("Customer earned" + intrest + " in interest ");
		setAccountBalance(getAccountBalance()+intrest);
	}
}
