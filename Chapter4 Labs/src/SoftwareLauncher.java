import java.util.*;

public class SoftwareLauncher {

	public static void main(String[] args) {
		double units;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter number of units sold: ");
		units = keyboard.nextDouble();
		
		Software s1 = new Software(units);
		
		System.out.println(units + " Units cost " + s1.getDiscount());
				
		

	}

}
