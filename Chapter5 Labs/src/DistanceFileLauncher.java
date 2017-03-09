import java.util.Scanner;
import java.io.*;

public class DistanceFileLauncher {

	public static void main(String[] args) throws IOException {
		
		Scanner keyboard = new Scanner(System.in);
		
		double speed = 0;
		double time = 0;
		double distance;
		//creates file 
		PrintWriter outPutFile = new PrintWriter("Distance.txt");
		
		//asks for speed
		System.out.println("How fast were you traveling (MPH)?");
		speed = keyboard.nextDouble();
		keyboard.nextLine();
		//if speed is less than 1 go through loop 
		while(speed < 1)
		{
			System.out.println("How fast were you traveling (MPH)?");
			speed = keyboard.nextDouble();
			keyboard.nextLine();
		}
		//user hours
		System.out.println("How many hours were you traveling?");
		time = keyboard.nextDouble();
		keyboard.nextLine();
		//hours below 1, go through loop
		while(time < 1)
		{
			System.out.println("How many hours were you traveling?");
			time = keyboard.nextDouble();
			keyboard.nextLine();
		}
		//constructor 
		DistanceTraveled d1 = new DistanceTraveled(speed, time);
		
		//gets the distance
		d1.getDistance();
		
		//prints to file 
		outPutFile.println("Hour      Distance Traveled");
		outPutFile.println("-------------------------------");
		
		//for loop for hours and speed
		for(double number = 1; number <= time; number++)
		{
			distance = speed * number;
			outPutFile.println(number + "\t\t"  + distance);
		}
		
		outPutFile.close();
		

		
		
	}

	

}

