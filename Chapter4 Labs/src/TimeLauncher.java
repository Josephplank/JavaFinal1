import java.util.*;
public class TimeLauncher {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		double userSeconds;
		
		System.out.println("Please enter a number in seconds: ");
		userSeconds = keyboard.nextDouble();
		
		Time t1 = new Time(userSeconds);
		
		t1.getTime();

	}

}
