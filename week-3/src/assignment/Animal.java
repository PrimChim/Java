package assignment;

public class Animal {
	
	private int legNumber;
	public String animalia;
	
	public void setLegNumber(int legNumber) {
		this.legNumber = legNumber;
	}
	
	public int getLegNumber() {
		return this.legNumber;
	}
	
	Animal(String animalia){
		this.animalia = animalia;
	}
	
	public static void main(String []args) {
		Animal horse = new Animal("Mammal");
		horse.setLegNumber(4);
		System.out.println("Numbers of legs that horse has are "+horse.getLegNumber());
	}

}
