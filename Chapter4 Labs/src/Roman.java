import java.util.*;
public class Roman {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int userNum;
		
		System.out.println("Please enter a number 1-10 to get roman numeral: ");
		userNum = keyboard.nextInt();
		
		Roman1 r1 = new Roman1(userNum);
		
		 //System.out.println(r1.getNum());
		
		
		}
	}


