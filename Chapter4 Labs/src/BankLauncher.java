import java.util.*;
public class BankLauncher {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		//local variables
		double checks;
		double balance;
		
		//user input for account balance
		System.out.println("What is your account balance?");
		balance = keyboard.nextDouble();
		keyboard.nextLine();
		
		//user input for checks written
		System.out.println("How many checks did you write this month?");
		checks = keyboard.nextInt();
		keyboard.nextLine();
		
		//gets the balance
		Bank b1 = new Bank(checks, balance);
		b1.getBalanceFees();
		
		//output
		System.out.println("You wrote: " + checks + " Checks");
		System.out.println("Total service fees for the month: $" + b1.getFees());
		System.out.println("Account Balance: $" + b1.getBalance());
	}

}
