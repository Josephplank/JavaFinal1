
public class SavingAccount {

	private double annualInterestRate;
	private double balance;
	
	
	public SavingAccount(double startingBalance) {
	balance = startingBalance;
	annualInterestRate = 0;
	}
	
	public void withdraw(double userAmount)
	{
		balance -= userAmount;
	}
	
	public void deposit(double userAmount)
	{
		balance += userAmount;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public double addMonthlyInterest()
	{
		double monthlyInterest = ((annualInterestRate / 12) * balance);
		balance += monthlyInterest;
		
		return monthlyInterest;
	}
	public void setAnnualInterestRate(double newRate)
	{
		annualInterestRate = newRate / 100;
	}

}
