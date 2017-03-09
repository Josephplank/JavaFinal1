import java.util.*;

public class SpeedOfSoundLauncher {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String userMedium;
		double distance;
		
		SpeedOfSound s1 = new SpeedOfSound();
		
		System.out.println("Enter the medium that you want the amount of time sound travel in:\nPlease enter Air, Water or Steel.");
		userMedium = keyboard.nextLine();
		
		s1.setUserMedium(userMedium);
		
		System.out.println("Please enter the distance a sound wave will travel in the selected medium");
		distance = keyboard.nextDouble();
		keyboard.nextLine();
		
		s1.setDistance(distance);
		
		if(userMedium.equalsIgnoreCase("air") ){
			s1.getSpeedInAir();
		}else if(userMedium.equalsIgnoreCase("water") )
		{
			s1.getSpeedInWater();
		}else if (userMedium.equalsIgnoreCase("steel") )
		{
			s1.getSpeedInSteel();
		}else
		{
			System.out.println("Please enter a valid medium");
		}
		
	
		
	}

}
