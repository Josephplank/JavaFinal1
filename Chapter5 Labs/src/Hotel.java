
public class Hotel {

	private double numFloors;
	private double numRooms;
	private double occupiedRooms;

	
	public Hotel(double numFloors, double numRooms, double occupiedRooms) {
		this.numFloors = numFloors;
		this.numRooms = numRooms;
		this.occupiedRooms = occupiedRooms;
	}
	//returns occupied rooms
	public double getOccupiedRooms() {
		return occupiedRooms;
	}
	//sets occupied rooms
	public void setOccupiedRooms(double occupiedRooms) {
		this.occupiedRooms = occupiedRooms;
	}
	//returns number of rooms
	public double getNumRooms() {
		
		return numRooms;
	}
	//sets number of rooms
	public void setNumRooms(double numRooms) {
		this.numRooms = numRooms;
	}
	//return floors
	public double getNumFloors() {
		return numFloors;
	}
	//sets number of floors
	public void setNumFloors(double numFloors) {
		this.numFloors = numFloors;
	}
	//calculates percent
	public double calcPercent()
	{
		double percent = (occupiedRooms / numRooms) * 100;
		
		return percent;
	}

	

}
