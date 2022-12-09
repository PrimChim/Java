package vehicle;

public class Vehicle {
	public int tyreDiameter;
	private int numberOfSeats;
	protected String modelString;
	
	
	Vehicle(int tyreDiameter,String modelString){
		this.tyreDiameter = tyreDiameter;
		this.modelString = modelString;
	}
	
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
	public int getNumberOfSeats() {
		return this.numberOfSeats;
	}
	
	public boolean canJoin() {
		return true;
	}
	
}
