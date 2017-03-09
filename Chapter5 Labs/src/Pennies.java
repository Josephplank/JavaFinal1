
public class Pennies {

	private double days;

	public Pennies(double days) {
		this.days = days;
	}
	//returns days
	public double getDays() {
		return days;
	}
	//sets days
	public void setDays(double days) {
		this.days = days;
	}
//calculates salary
	public double getSalary()
	{
		double dollars = .01;
		
		System.out.println("Days      Salary");
		System.out.println("-------------------------------");
		
		if(days > 1)
		{
			for(double number = 1; number <= days; number++)
			{
				System.out.printf("%.1f \t\t $%,.2f\n", number, dollars);
				dollars += dollars;
				
			}
		}else {
			System.out.println("Day 1: " + dollars);
		}
		
		return dollars;
	}

}
