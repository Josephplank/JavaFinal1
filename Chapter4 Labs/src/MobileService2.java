
public class MobileService2 {

	public MobileService2() {
		
	}
	
	private final double PACKAGE_A = 39.99;
	private final double PACKAGE_B = 59.99;
	private final double PACKAGE_C = 69.99;
	private final double PACKAGE_A_MINUTES = 450;
	private final double PACKAGE_B_MINUTES = 900;
	private final double PACKAGE_A_FEE = .45;
	private final double PACKAGE_B_FEE = .40;
	
	private String userPackage;
	private double userMinutes;
	
	public MobileService2(String userPackage, double userMinutes) {
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
		double packageCSavings = 0;
		double packageBSavings = 0;
		
		double packageBPriceCompare = 0;
		double extraBChargeCompare = 0;
		double minutesBExceededCompare = 0;
		
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
			
			if(userMinutes > PACKAGE_B_MINUTES)
			{
				minutesBExceededCompare = userMinutes - PACKAGE_B_MINUTES;
				extraBChargeCompare = minutesBExceededCompare * PACKAGE_B_FEE;
				
			}
			packageBPriceCompare = PACKAGE_B + extraBChargeCompare;
			
			if(packageBPriceCompare < totalBill)
			{
				packageBSavings = totalBill - packageBPriceCompare;
				System.out.printf("You will save $%,.2f if you switch to package B.\n", packageBSavings);
			}
			
			if(PACKAGE_C < totalBill)
			{
				packageCSavings = totalBill - PACKAGE_C;
				System.out.printf("You will save $%,.2f if you switch to package C.\n", packageCSavings);
			}
		}else if(userPackage.equalsIgnoreCase("b"))
		{
			if(userMinutes > PACKAGE_B_MINUTES)
			{
				minutesExceeded = userMinutes - PACKAGE_B_MINUTES;
				extraCharge = minutesExceeded * PACKAGE_B_FEE;
				
			}
			totalBill = PACKAGE_B + extraCharge;
			
			
			if(PACKAGE_C < totalBill)
			{
				packageCSavings = totalBill - PACKAGE_C;
				System.out.printf("You will save $%,.2f if you switch to package C.\n", packageCSavings);
			}
		}else if(userPackage.equalsIgnoreCase("c"))
		{
			totalBill = PACKAGE_C;
		}
		System.out.printf("You chose package: " + userPackage + "\nMinutes Exceeded: " + minutesExceeded + "\nExtra Charge: $%.2f\nTotal Bill: $%.2f", extraCharge, totalBill);
	}

}
