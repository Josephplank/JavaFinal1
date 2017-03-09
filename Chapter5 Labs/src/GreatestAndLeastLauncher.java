import java.util.*;
public class GreatestAndLeastLauncher {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		
		int userNum = 0;
		String numTotal = "";
		int sentinal = -99;
		int smallestNum;
		int largestNum;
		
		//asks user for first number
		System.out.println("Please enter first number:");
		userNum = keyboard.nextInt();
		keyboard.nextLine();
		//set smallest and highest number
		smallestNum = userNum;
		largestNum = userNum;
		//while loop for sentinal and highest and lowest number
		while(userNum != sentinal)
		{
			
			numTotal = numTotal + " " + userNum + ",";
			System.out.println("Your numbers: (" + numTotal + " )");
			
			
			if (userNum < smallestNum)
			{
				smallestNum = userNum;
			}else if(userNum > largestNum)
			{
				largestNum = userNum;
			}
			System.out.println("Please enter a series of numbers. (enter -99 when done).");
			userNum = keyboard.nextInt();
			keyboard.nextLine();
		}
		//constructor passing variables
		GreatestAndLeast g = new GreatestAndLeast(userNum, numTotal, sentinal, smallestNum, largestNum);
		
		//returns output
		g.getNum();
			
		}
	
	}


