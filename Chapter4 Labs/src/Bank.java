
public class Bank {

	//private variables
	private double userChecks;
	private double accountBalance;
	private double fee1;
	
	public Bank(double checks, double balance) {
		this.userChecks = checks;
		this.accountBalance = balance;
	}

	public void setChecks(int checks)
	{
		this.userChecks = checks;
	}
	
	//calculates balance with fees (if any)
	public void getBalanceFees()
	{
		double fee = 0;
		if(accountBalance < 400)
		{
			fee = 15;;
		}
		
		if(userChecks < 20)
		{
			fee1 = (.10 * userChecks) + 10;
		}
		else if(userChecks >= 20 && userChecks <= 39)
		{
			fee1 = (.08 * userChecks) + 10;
		}
		else if(userChecks >= 40 && userChecks <= 59)
		{
			fee1 = (.06 * userChecks) + 10;
		}
		else if(userChecks >60)
		{
		 fee1 = (.04 * userChecks) + 10;
		}
		
		fee1 = fee1 + fee;
		accountBalance = accountBalance - fee1;
	}
	
	public double getBalance(){
		return accountBalance;
	}
	
	public double getFees(){
		return fee1;
	}
	
}
