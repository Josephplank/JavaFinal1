import java.util.*;
public class RunningLauncher {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		//local variables
		String name1, name2, name3;
		double minutes1, minutes2, minutes3;
		
		//runner object
		Running r1 = new Running();
		
		//name a minutes it took to run
		System.out.println("What is your name?");
		name1 = keyboard.nextLine();
		
		r1.setName1(name1);
		
		System.out.println("How fast did you run?");
		minutes1 = keyboard.nextDouble();
		keyboard.nextLine();
		
		r1.setMinutes1(minutes1);
		
		System.out.println("What is your name?");
		name2 = keyboard.nextLine();
	
		r1.setName2(name2);
		
		System.out.println("How fast did you run?");
		minutes2 = keyboard.nextDouble();
		keyboard.nextLine();
		
		r1.setMinutes2(minutes2);
		
		System.out.println("What is your name?");
		name3 = keyboard.nextLine();
		
		r1.setName3(name3);
		
		System.out.println("How fast did you run?");
		minutes3 = keyboard.nextDouble();
		keyboard.nextLine();
		
		r1.setMinutes3(minutes3);
		
		//gets winning order
		r1.getWinningOrder();
		
		
	}

}
