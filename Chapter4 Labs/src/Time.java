
public class Time {

	private double seconds;
	
	public Time(double sec) {
	this.seconds = sec;
	}
	
	public void getTime()
	{
		double output;
		
		if(seconds >= 86400)
		{
			output =  (((double)seconds / 60) / 60 /24);
			System.out.println(seconds + " Seconds is " + output + " day(s).");
		}
		else if(seconds >= 3600 )
		{
			output =  (((double)seconds / 60) / 60);
			System.out.println(seconds + " Seconds is " + output + " hour(s).");
		}else if (seconds >= 60)
		{
			output = (double)seconds / 60;
			System.out.println(seconds + " Seconds is " + output + " Minute(s).");
		}
	}

	
}
