
public class DistanceFile {

	private double speed;
	private double time;
	private double distance;
	
	
	public DistanceFile(double speed, double time) {
		this.speed = speed;
		this.time = time;
		
	}
	
	//returns speed
	public double getSpeed() {
		return speed;
	}
	//sets speed
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	//returns time
	public double getTime() {
		return time;
	}
	//sets time
	public void setTime(double time) {
		this.time = time;
	}
	//calculates distance
	public double getDistance()
	{
		
		System.out.println("Hour      Distance Traveled");
		System.out.println("-------------------------------");
		
		for(double number = 1; number <= time; number++)
		{
			distance = speed * number;
			System.out.println(number + "\t\t"  + distance);
		}
		
		return distance;
		
	}
		

}
