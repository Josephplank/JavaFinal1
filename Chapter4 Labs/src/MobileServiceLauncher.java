import java.util.*;
public class MobileServiceLauncher {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		
		String userPackage;
		double userMinutes;
		
		
		System.out.println("What package do you have?");
		userPackage = keyboard.nextLine();
		
		System.out.println("How many minutes did you use?");
		userMinutes = keyboard.nextInt();
		keyboard.nextLine();
		
		MobileService m1 = new MobileService(userPackage, userMinutes);
		
		m1.getBill();

}
}
