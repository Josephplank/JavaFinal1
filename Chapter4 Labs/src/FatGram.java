
public class FatGram {

	
	//private variables
	private double calories;
	private double fatGrams;
	
	
	public FatGram() {
		
	}

	//getters and setters
	public void setCalories(double calories)
	{
		this.calories = calories;
	}
	public double getCalories()
	{
		return calories;
	}
	
	public void setFatGrams(double fatGrams)
	{
		this.fatGrams = fatGrams;
	}
	public double getFatGrams()
	{
		return fatGrams;
	}
	
	//calculates the fat percent and also includes if it is low in fat
	public void getFatPercent()
	{
		double caloriesFromFat;
		double percent;
		
		caloriesFromFat = fatGrams * 9;
		percent = (caloriesFromFat / calories) * 100;
		
		
		
		if(caloriesFromFat > calories)
		{
			System.out.println("Calories from fat cannot be greater than total number of calories. Please run the program again.");
		}else {
			System.out.printf("The percentage of calories from fat: %.2f%%\n" , percent);
		}
		
		if(percent < 30)
		{
			System.out.println("This is low in fat!");
		}
		
	}
}
