import java.util.*;
import java.text.*;

public class ShippingLauncher {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("#0.00");
		
		double weight;
		double milesTraveled;
		
		Shipping s1 = new Shipping();
		
		System.out.println("What is the weight of the package?(Kg)");
		weight = keyboard.nextDouble();
		
		s1.setWeight(weight);
		
		System.out.println("How many miles need to be travel?");
		milesTraveled = keyboard.nextDouble();
		
		s1.setMiles(milesTraveled);
		
		System.out.println("Weight: " + s1.getWeight());
		System.out.println("Miles Traveled: " + s1.getMilesTraveled());
		System.out.println("ShippingCharges Charge: $" + f.format(s1.getShippingCharge()));
		

	}

}
