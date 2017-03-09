import java.util.*;
public class HotelLauncher {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		double numFloors=0;
		double numRooms = 0;
		double occupiedRooms=0;
		double totalOccupancy = 0;
		double totalRooms = 0;
		double totalVacant=0;
		
		//asks for number of floors
		System.out.println("How many floors does the hotel have?");
		numFloors = keyboard.nextDouble();
		keyboard.nextLine();
		//while loops for number less than 1
		while(numFloors < 1)
		{
			System.out.println("Please enter a valid number.");
			System.out.println("How many floors does the hotel have?");
			numFloors = keyboard.nextDouble();
			keyboard.nextLine();
		}
		
		
		//for loop for number of floors
		for(double number = 1; number <= numFloors; number++)
		{
			System.out.println("How many rooms are on floor " + (int)number + " have?(Should not be less than 10)");
			numRooms = keyboard.nextDouble();
			//while loop for number of rooms less than 10
			while(numRooms < 10)
			{
				System.out.println("How many rooms are on floor " + (int)number + " have?");
				numRooms = keyboard.nextDouble();
				
			}
			
			System.out.println("How many rooms are on floor " + (int)number + " are occupied?");
			occupiedRooms = keyboard.nextDouble();
			//while loop for number of rooms and occupied rooms
			while (occupiedRooms > numRooms)
			{
				//output
				System.out.println("Sorry cant have more occupied rooms than number of rooms..");
				
				System.out.println("How many rooms are on floor " + (int)number + " are occupied?");
				occupiedRooms = keyboard.nextDouble();
			}
			
			//calculations
			totalRooms += numRooms;
			totalOccupancy += occupiedRooms;
			totalVacant = totalRooms - totalOccupancy;
			
		}
		
		//object passing values
		Hotel f1 = new Hotel(numFloors, totalRooms, totalOccupancy);
		//output
		System.out.println("Total rooms: " + (int)totalRooms);
		System.out.println("Occupied rooms: " + (int)totalOccupancy);
		System.out.println("Vacant rooms: " + (int)totalVacant);
		System.out.printf("Occupancy Rate: %.2f%%", f1.calcPercent());
		
	}

}
