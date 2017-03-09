import java.util.*;
public class SavingAccountLauncher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double userAnnualInterestRate;
		double userStartingBalance;
		int userOfMonths;
		double depositAmount;
		double withdrawAmount;
		double totalDeposit = 0;
		double totalWithdrawls = 0;
		double totalInterestEarned = 0;
		
		System.out.println("Please enter the annual interest rate: ");
		userAnnualInterestRate = keyboard.nextDouble();
		
		System.out.println("Please enter starting balance: ");
		userStartingBalance = keyboard.nextDouble();
		
		System.out.println("Please enter number of months: ");
		userOfMonths = keyboard.nextInt();
		keyboard.nextLine();
		
		SavingAccount account1 = new SavingAccount(userStartingBalance);
		account1.setAnnualInterestRate(userAnnualInterestRate);
		
		for(int currentMonth = 1; currentMonth <= userOfMonths; currentMonth++)
		{
			System.out.println("How munch did you deposit during month " + currentMonth + "?");
			depositAmount = keyboard.nextDouble();
			
			totalDeposit += depositAmount;
			
			account1.deposit(depositAmount);
			
			System.out.println("How munch did you withdraw during month " + currentMonth + "?");
			withdrawAmount = keyboard.nextDouble();
		
			totalWithdrawls += withdrawAmount;
			
			account1.withdraw(withdrawAmount);
			
			totalInterestEarned += account1.addMonthlyInterest();
		}
		
		System.out.printf("The final balance at the end of %d months is $%.2f\nThe total amount of deposits: $%.2f\n" +
							"The total amount of withdrawls: $%.2f\nThe total interest earned: $%.2f", userOfMonths, account1.getBalance(), totalDeposit, totalWithdrawls, totalInterestEarned );
		
	}

}
