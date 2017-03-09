import java.util.*;
public class MobileService2Launcher {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String userPackage;
		double userMinutes;
		
		
		System.out.println("What package do you have?");
		userPackage = keyboard.nextLine();
		
		System.out.println("How many minutes did you use?");
		userMinutes = keyboard.nextInt();
		keyboard.nextLine();
		
		MobileService2 m1 = new MobileService2(userPackage, userMinutes);
		
		m1.getBill();
	}

}
