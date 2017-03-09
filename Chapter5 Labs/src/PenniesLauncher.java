import java.util.*;
public class PenniesLauncher {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		double days;
		
		//user number of days
		System.out.println("How many days did you work?");
		days = keyboard.nextDouble();
		keyboard.nextLine();
		//while loop for days not less than 1
		while(days < 1)
		{
			System.out.println("Days worked should be greater than 0, please reenter: ");
			days = keyboard.nextDouble();
			keyboard.nextLine();
		}
		
		Pennies p1 = new Pennies(days);
		//gets the salary
		p1.getSalary();
	}

}
