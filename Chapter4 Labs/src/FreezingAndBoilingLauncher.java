import java.util.*;

public class FreezingAndBoilingLauncher {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		
		//local variable
		double temp;
		
		//user temp input
		System.out.println("Please enter a temperature: ");
		temp = keyboard.nextDouble();
		
		FreezingAndBoiling f1 = new FreezingAndBoiling(temp);
		
		
		//returns true statements
		if(f1.isEthylFreezing())
		{
			System.out.println("Ethyl will freeze at the temperature");
		}
		if(f1.isEthylBoiling())
		{
			System.out.println("Ethyl will boil at the temperature");
		}
		if(f1.isOxygenFreezing())
		{
			System.out.println("Oxygen will freeze at the temperature");
		}
		if(f1.isOxygenBoiling())
		{
			System.out.println("Oxygen will boil at the temperature");
		}
		if(f1.isWaterFreezing())
		{
			System.out.println("Water will freeze at the temperature");
		}
		if(f1.isWaterBoiling())
		{
			System.out.println("Water will boil at the temperature");
		}
		
	}

}
