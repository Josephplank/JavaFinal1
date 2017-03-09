import java.util.*;
import java.text.*;
public class PopulationLauncher {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,##0");
		
		double startingPop;
		double dailyIncrease;
		double numDays;
		
		//asks user for starting pop
		System.out.println("What is the starting population size?");
		startingPop = keyboard.nextDouble();
		keyboard.nextLine();
		//while loop starting pop not less than 2
		while (startingPop < 2)
		{
			System.out.println("Sorry the population can not be less than 2..");
			System.out.println("What is the starting population size?");
			startingPop = keyboard.nextDouble();
			keyboard.nextLine();
		}
		//asks user for daily percent increase
		System.out.println("What is your daily average increase? (percent)");
		dailyIncrease = keyboard.nextDouble();
		keyboard.nextLine();
		//starting pop not a negative
		while(startingPop < 0)
		{
			System.out.println("Sorry you can not have a negative increase, please try again..");
			System.out.println("What is your daily average increase? (percent)");
			dailyIncrease = keyboard.nextDouble();
			keyboard.nextLine();
		}
		//user number of days
		System.out.println("Number of days multiplied: ");
		numDays = keyboard.nextDouble();
		keyboard.nextLine();
		//while loop for days not less than 1
		while(numDays < 1)
		{
			System.out.println("Number of days cant be less than 1, please try again");
			System.out.println("Number of days multiplied: ");
			numDays = keyboard.nextDouble();
			keyboard.nextLine();
			
		}
		
		Population p1 = new Population(startingPop, dailyIncrease, numDays);
		//gets output
		df.format(p1.calcPopulation());
		
	}

}
