
public class Software {

	private double numUnits;
	
	public Software(double units) {
		this.numUnits = units;
	}

	public void setUnits(double u)
	{
		this.numUnits = u;
	}
	
	public double getDiscount()
	{
		double discount = 0;
		
		if(numUnits >= 10 && numUnits <= 19)
		{
			discount = ((numUnits * 99) * .20) ;
		}else if(numUnits >= 20 && numUnits <= 49)
		{
			discount = ((numUnits * 99) * .30);
		}else if(numUnits >= 50 && numUnits <= 99)
		{
			discount = ((numUnits * 99) * .40);
		}else if(numUnits >= 100)
		{
			discount = ((numUnits * 99) * .50);
		}
		return (numUnits * 99) - discount;
	}
}
