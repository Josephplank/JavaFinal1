import java.util.*;

public class TestScoresLauncher {

	public static void main(String[] args) {
		//local variables
		double testOne;
		double testTwo;
		double testThree;
		double temp = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		//valid test score entry else re do is not
		do{
		System.out.println("Please enter test score #1: ");
		testOne = keyboard.nextDouble();
		
		if(testOne < 0 || testOne >100)
		{
			System.out.println("Invalid Score.");
		}else{
			temp = 1;
		}
		}while(temp != 1);
		temp = 0;
		
		//valid test score entry else re do is not
		do{
			System.out.println("Please enter test score #2: ");
			testTwo = keyboard.nextDouble();
			
			if(testTwo < 0 || testTwo > 100)
			{
				System.out.println("Invalid Score.");
			}else{
				temp = 1;
			}
			}while(temp != 1);
			temp = 0;
			
			//valid test score entry else re do is not
			do{
				System.out.println("Please enter test score #3: ");
				testThree = keyboard.nextDouble();
				
				if(testThree < 0 || testThree >100)
				{
					System.out.println("Invalid Score.");
				}else{
					temp = 1;
				}
				}while(temp != 1);
				temp = 0;
				
		TestScores t1 = new TestScores(testOne, testTwo, testThree);
		
		//output average and letter grade
		System.out.println("The average of the scores is: " + t1.calcAvg() + " which is equal to an: " + t1.getLetter());

	}

}
