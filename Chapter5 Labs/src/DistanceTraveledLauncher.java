import java.util.*;
public class DistanceTraveledLauncher {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		double speed = 0;
		double time = 0;
		
		//asks user for speed
		System.out.println("How fast were you traveling (MPH)?");
		speed = keyboard.nextDouble();
		keyboard.nextLine();
		//while loop for speed less than 1
		while(speed < 1)
		{
			System.out.println("How fast were you traveling (MPH)?");
			speed = keyboard.nextDouble();
			keyboard.nextLine();
		}
		//asks for hours traveled
		System.out.println("How many hours were you traveling?");
		time = keyboard.nextDouble();
		keyboard.nextLine();
		//while loop for hours less than 1
		while(time < 1)
		{
			System.out.println("How many hours were you traveling?");
			time = keyboard.nextDouble();
			keyboard.nextLine();
		}
		//constructor with speed and hours
		DistanceTraveled d1 = new DistanceTraveled(speed, time);
		
		System.out.println("Hour      Distance Traveled");
		System.out.println("-------------------------------");
		//gets speed
		d1.getDistance();
		
		
		

		
		
	}

}
