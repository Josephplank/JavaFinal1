import java.util.*;
public class SumOfNumbersLauncher {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		//variables for user input and sum of numbers
		int userNumber = 0;
		int sum= 0;
		
		//while loop to determine if number is a negative integer
		
		while(userNumber < 1)
		{
			System.out.println("Please enter a positive integer: ");
			userNumber = keyboard.nextInt();
			keyboard.nextLine();
		}
		
		//for loop that adds the incremented number to sum
		
		for(int number = 1; number <= userNumber; number++ )
		{
			sum += number;
		}
		System.out.println("The sum of numbers from 1-" + userNumber + " is: " + sum);
		
	}

}
