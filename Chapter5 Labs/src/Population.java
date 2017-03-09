import java.text.*;
public class Population {

	DecimalFormat df = new DecimalFormat("#,##0");
	
	private double startingPop;
	private double dailyIncrease;
	private double numDays;
	private double dailyPopulation;
	double totalPop;
	
	public Population(double startingPop, double dailyIncrease, double numDays) {
		this.startingPop = startingPop;
		this.dailyIncrease = dailyIncrease / 100;
		this. numDays = numDays;
	}
	//returns startingppop
	public double getStartingPop() {
		return startingPop;
	}
	//sets starting pop
	public void setStartingPop(double startingPop) {
		this.startingPop = startingPop;
	}
//returns daily increase
	public double getDailyIncrease() {
		
		
		return dailyIncrease;
	}
//sets daily increase
	public void setDailyIncrease(double dailyIncrease) {
		this.dailyIncrease = dailyIncrease / 100;
	}
//returns number of days
	public double getNumDays() {
		return numDays;
	}
//sets number of days
	public void setNumDays(double numDays) {
		this.numDays = numDays;
	}
// daily pop calculation
	public double firstDay()
	{
		dailyPopulation = (startingPop * dailyIncrease) + startingPop;
		
		return startingPop;
	}
	//calc pop output
	public double calcPopulation()
	{
		
		System.out.println("Day \t\t Population");
		System.out.println("---------------------------");
		
		
		
		for(double number = 1; number <= numDays; number++)
		{
			if (number == 1){
				dailyPopulation = (startingPop * dailyIncrease) + startingPop;
			} else{
			dailyPopulation = (dailyPopulation * dailyIncrease) + dailyPopulation;
			}
			System.out.println((int)number + " \t\t " + df.format(dailyPopulation));
			
			
		} return dailyPopulation;
		
	}
	

}
