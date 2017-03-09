
public class TestScores {
	//variables hold test scores
	private double test1;
	private double test2;
	private double test3;
	
	//constructor
	public TestScores(double t1, double t2, double t3) {
		this.test1 = t1;
		this.test2 = t2;
		this.test3 = t3;
	}
	
	public void setTestOne(double one)
	{
		this.test1 = one;
	}
	public void setTestTwo(double two)
	{
		this.test2 = two;
	}
	public void setTestThree(double three)
	{
		this.test3 = three;
	}
	
	//calculate average
	public double calcAvg()
	{
		return (test1 + test2 + test3) /3;
	}
	
	//if statement returning letter grade
	public String getLetter()
	{
		String letter="";
		
		if(calcAvg() < 60)
		{
			letter = "F";
		}else if(calcAvg() >= 60 && calcAvg() < 70)
		{
			letter = "D";
		}else if(calcAvg() >= 70 && calcAvg() < 80)
		{
			letter = "C";
		}else if(calcAvg() >= 80 && calcAvg() < 90)
		{
			letter = "B";
		}else if(calcAvg() >= 90 && calcAvg() <= 100)
		{
			letter = "A";
		}
		return letter;
	
	}
	

}
