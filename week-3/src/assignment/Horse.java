package assignment;

public class Horse extends Animal {
	
	public Horse(String animal){
		super(animal);
	}
	
	
	public static void main(String []args) {
		Horse horse = new Horse("mammal");
		
		horse.setLegNumber(4);
		System.out.println("Horse has "+horse.getLegNumber()+" legs.");
	}

}
