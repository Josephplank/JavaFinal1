
public class RainFall {

	private double years = 0;
	private double months = 12;
	private double inches = 0;
	private double totalInches = 0;
	private double avg;
	
	
	public RainFall(double years, double months, double inches) {
		this.years = years;
		this.months = months;
		this.inches = inches;
	}

	//returns years
	public double getYears() {
		return years;
	}

	//sets years
	public void setYears(double years) {
		this.years = years;
	}

	//returns months
	public double getMonths() {
		return months;
	}

	//sets months
	public void setMonths(double months) {
		this.months = months;
	}

	//returns inches
	public double getInches() {
		return inches;
	}

	//sets inches
	public void setInches(double inches) {
		this.inches = inches;
	}

	//returns total inches
	public double getTotalInches() {
		return totalInches;
	}

	//sets total inches
	public void setTotalInches(double totalInches) {
		this.totalInches = totalInches;
	}
	// calculates avg
	public double calcAvg()
	{
		avg = inches /(years * months);
		
		return avg;
	}

}
