import java.util.*;
public class RainFallLauncher {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		double years = 0;
		double months = 12;
		double inches = 0;
		double totalInches = 0;
		//user number of years
		System.out.println("How many years?");
		years = keyboard.nextDouble();
		keyboard.nextLine();
		//while loops years not less than 1
		while (years < 1)
		{
			System.out.println("Input must be 1 or greater, please try again.");
			System.out.println("How many years?");
			years = keyboard.nextDouble();
			keyboard.nextLine();
		}
		//for loop to increment years / months
		for(int number = 1; number <= years; number++)
		{
			for(int number2 = 1; number2 <= months; number2++)
			{
				System.out.println("Rain fall for year " + number + ", month " + number2);
				inches = keyboard.nextDouble();
				keyboard.nextLine();
				
				totalInches += inches;
			}
			
		}
		
		RainFall r1 = new RainFall(years, months, totalInches);
		//output
		System.out.println("The average rain fall for the entire period is: " + r1.calcAvg());
		
	}

}
