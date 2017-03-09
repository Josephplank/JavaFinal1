
public class GreatestAndLeast {

	
	
	private int userNum = 0;
	private String numTotal = "";
	private int sentinal = -99;
	private int smallestNum;
	private int largestNum;
	
	//constructor with variables
	public GreatestAndLeast(int userNum, String numTotal, int sentinal, int smallestNum, int largestNum) {
		this.userNum = userNum;
		this.numTotal = numTotal;
		this.sentinal = sentinal;
		this.smallestNum = smallestNum;
		this.largestNum = largestNum;
	}
	//output for lowest and highest number
	public void getNum()
	{
		System.out.println("Lowest number is: " + smallestNum + "\nHighest number is: " + largestNum);
	}
	
}
