
public class Running {

	
	//private vaiables
	private String name1, name2, name3;
	private double minutes1, minutes2, minutes3;
	
	public Running() {
		
	}
	
	//getters and setters
	public void setName1(String name1)
	{
		this.name1 = name1;
	}
	public String getName1()
	{
		return name1;
	}
	public void setName2(String name2)
	{
		this.name2 = name2;
	}
	public String getName2()
	{
		return name2;
	}
	public void setName3(String name3)
	{
		this.name3 = name3;
	}
	public String getName3()
	{
		return name3;
	}
	
	public void setMinutes1(double minutes1)
	{
		this.minutes1 = minutes1;
	}
	public double getMinutes1()
	{
		return minutes1;
	}
	public void setMinutes2(double minutes2)
	{
		this.minutes2 = minutes2;
	}
	public double getMinutes2()
	{
		return minutes2;
	}
	public void setMinutes3(double minutes3)
	{
		this.minutes3 = minutes3;
	}
	public double getMinutes3()
	{
		return minutes3;
	}
	
	//calculates 1st, 2nd and 3rd by time(minutes)
	public void getWinningOrder()
	{
		
		
		if(minutes1 < minutes2 && minutes1 < minutes3)
		{
			System.out.println(name1 + " finished the race in: " + minutes1 + " minutes, putting him in: 1st place");
		if(minutes2 < minutes3)
		{
			System.out.println(name2 + " finished the race in: " + minutes2 + " minutes, putting him in: 2nd place");
			System.out.println(name3 + " finished the race in: " + minutes3 + " minutes, putting him in: 3rd place");
		}else{
			System.out.println(name3 + " finished the race in: " + minutes3 + " minutes, putting him in: 2nd place");
			System.out.println(name2 + " finished the race in: " + minutes2 + " minutes, putting him in: 3rd place");
			
		}
		}else if(minutes2 < minutes1 && minutes2 < minutes3){
			
			System.out.println(name2 + " finished the race in: " + minutes2 + " minutes, putting him in: 1st place");
		if(minutes1 < minutes3)
		{
			System.out.println(name1 + " finished the race in: " + minutes1 + " minutes, putting him in: 2nd place");
			System.out.println(name3 + " finished the race in: " + minutes3 + " minutes, putting him in: 3rd place");
		}else{
			System.out.println(name3 + " finished the race in: " + minutes3 + " minutes, putting him in: 2nd place");
			System.out.println(name1 + " finished the race in: " + minutes1 + " minutes, putting him in: 3rd place");
			
		}
		}else if(minutes3 < minutes1 && minutes3 < minutes2){
			
			System.out.println(name3 + " finished the race in: " + minutes3 + " minutes, putting him in: 1st place");
		if(minutes2 < minutes1)
		{
			System.out.println(name2 + " finished the race in: " + minutes2 + " minutes, putting him in: 2nd place");
			System.out.println(name1 + " finished the race in: " + minutes1 + " minutes, putting him in: 3rd place");
		}else{
			System.out.println(name1 + " finished the race in: " + minutes1 + " minutes, putting him in: 2nd place");
			System.out.println(name2 + " finished the race in: " + minutes2 + " minutes, putting him in: 3rd place");
			
		}
		}
	}

}
