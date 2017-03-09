
public class MobileService {

	
	private final double PACKAGE_A = 39.99;
	private final double PACKAGE_B = 59.99;
	private final double PACKAGE_C = 69.99;
	private final double PACKAGE_A_MINUTES = 450;
	private final double PACKAGE_B_MINUTES = 900;
	private final double PACKAGE_A_FEE = .45;
	private final double PACKAGE_B_FEE = .40;
	
	private String userPackage;
	private double userMinutes;
	
	public MobileService(String userPackage, double userMinutes) {
		this.userPackage = userPackage;
		this.userMinutes = userMinutes;
	}

	public void setUserPackage(String userPackage)
	{
		this.userPackage = userPackage;
		
	}
	public String getUserPackage()
	{
		return userPackage;
		
	}
	
	public void setUserMinutes(double userMinutes)
	{
		this.userMinutes = userMinutes;
		
	}
	public double getUserMinutes()
	{
		return userMinutes;
		
	}
	
	public void getBill()
	{
		double minutesExceeded = 0;
		double extraCharge = 0;
		double totalBill= 0;
		
		if(userPackage.equalsIgnoreCase("a"))
		{
			if(userMinutes > PACKAGE_A_MINUTES)
			{
				minutesExceeded = userMinutes - PACKAGE_A_MINUTES;
				extraCharge = minutesExceeded * PACKAGE_A_FEE;
				
			}
			totalBill = PACKAGE_A + extraCharge;
		}else if(userPackage.equalsIgnoreCase("b"))
		{
			if(userMinutes > PACKAGE_B_MINUTES)
			{
				minutesExceeded = userMinutes - PACKAGE_B_MINUTES;
				extraCharge = minutesExceeded * PACKAGE_B_FEE;
				
			}
			totalBill = PACKAGE_B + extraCharge;
		}else if(userPackage.equalsIgnoreCase("c"))
		{
			totalBill = PACKAGE_C;
		}
		System.out.printf("You chose package: " + userPackage + "\nMinutes Exceeded: " + minutesExceeded + "\nExtra Charge: $%.2f\nTotal Bill: $%.2f", extraCharge, totalBill);
	}
	}

