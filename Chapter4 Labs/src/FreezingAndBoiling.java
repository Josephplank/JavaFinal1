
public class FreezingAndBoiling {

	//private variable
	private double temp;
	
	public FreezingAndBoiling(double temp) {
		this.temp = temp;
	}
	
	//getters and setters
	public void setTemp(double temp)
	{
		this.temp = temp;
	}
	public double getTemp()
	{
		return temp;
	}
	
	public boolean isEthylFreezing()
	{
		if(temp <= -173)
		{
			return true;
		}else{
			return false;
		}
	}
	
	//boolean values
	public boolean isEthylBoiling()
	{
		if(temp >= 172)
		{
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isOxygenFreezing()
	{
		if(temp <= -362)
		{
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isOxygenBoiling()
	{
		if(temp >= -306)
		{
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isWaterFreezing()
	{
		if(temp <= 32)
		{
			return true;
		}else{
			return false;
		}
	}
	public boolean isWaterBoiling()
	{
		if(temp >= 212)
		{
			return true;
		}else{
			return false;
		}
	}

}
