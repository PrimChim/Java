package vehicle;

import java.util.ArrayList;

public class Car extends Vehicle {
	
	int chesisNumber;
	
	ArrayList<Engine> engine;
	
	public Car(){
		super(10, "Scorpio");
	}
	
	void start() {
		System.out.println("Brum bhrum");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
