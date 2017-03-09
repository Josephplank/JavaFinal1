import java.util.*;
public class FatGramLauncher {

	public static void main(String[] args) {
		
		double calories;
		double fatGrams;
		
		Scanner keyboard = new Scanner(System.in);
		
		FatGram f1 = new FatGram();
		
		System.out.println("Please enter number of Calories(Total Calories): ");
		calories = keyboard.nextDouble();
		f1.setCalories(calories);
		
		System.out.println("Please enter number of Fat Grams: ");
		fatGrams = keyboard.nextDouble();
		f1.setFatGrams(fatGrams);
		
		f1.getFatPercent();
	}

}
