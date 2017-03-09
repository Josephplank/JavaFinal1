
public class Roman1 {

	private int number;
	
	public Roman1(int num) {
		this.number = num;
		
		switch(number)
		{
		case 1:
			System.out.println("The roman number is: I");
			break;
		case 2:
			System.out.println("The roman number is: II");
			break;
		case 3:
			System.out.println("The roman number is: III");
			break;
		case 4:
			System.out.println("The roman number is: IV");
			break;
		case 5:
			System.out.println("The roman number is: V");
			break;
		case 6:
			System.out.println("The roman number is: VI");
			break;
		case 7:
			System.out.println("The roman number is: VII");
			break;
		case 8:
			System.out.println("The roman number is: VIII");
			break;
		case 9:
			System.out.println("The roman number is: IX");
			break;
		case 10:
			System.out.println("The roman number is: X");
			break;
		default:
			System.out.println("You did not enter a valid number; please run the program again.");
		
	}

	}
}
