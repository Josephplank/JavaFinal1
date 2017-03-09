
public class Shipping {

	private double weight;
	private double milesTraveled;
	private double shippingCharge;
	private double cost;
	
	public Shipping() {
		
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	public double getWeight()
	{
		return weight;
	}

	public void setMiles(double milesTraveled)
	{
		this.milesTraveled = milesTraveled;
	}
	public double getMilesTraveled()
	{
		
		return milesTraveled;
	}
	
	public double getShippingCharge()
	{
		double temp = 0;
	
		
		if(weight <=2 )
		{
			shippingCharge = 1.1;
		}else if(weight >2 && weight <=6)
		{
			shippingCharge = 2.2;
		}else if(weight >6 && weight <=10)
		{
			shippingCharge = 3.7;
		}else if(weight > 10)
		{
			shippingCharge = 4.8;
		}
		
		
		if(milesTraveled > 500)
		{
			temp = (int)milesTraveled / 500;
			
			if(0 ==(milesTraveled % 500))
			{
				cost = temp * shippingCharge;
			}else{
				cost = (temp + 1) * shippingCharge;
			}
		}
		return cost;
		
	}
}
