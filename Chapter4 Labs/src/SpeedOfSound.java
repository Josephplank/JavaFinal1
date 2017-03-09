
public class SpeedOfSound {

	String userMedium;
	private double distance, time;
	
	
	public SpeedOfSound() {
		
	}
	
	public void setUserMedium(String userMedium)
	{
		this.userMedium = userMedium;
	}
	
	public String getUserMedium()
	{
		return userMedium;
	}
	public void setDistance(double distance)
	{
		this.distance = distance;
		
	}
	public double getDistance()
	{
		return distance;
	}
	
	
	public void getSpeedInAir()
	{
		time = distance/1100;
		System.out.println("It will take " + time + " seconds to travel " + distance + " feet through air");
	}
	
	public void getSpeedInWater()
	{
			time = distance / 4900;
			System.out.println("It will take " + time + " seconds to travel " + distance + " feet per second through water");
	
	}
	
	public void getSpeedInSteel()
	{
			time = distance / 16400;
			System.out.println("It will take " + time + " seconds to travel " + distance + " feet per second through steel");
			
	}
}
