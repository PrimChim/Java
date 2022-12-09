package heraldcollege;

public class Encapsulation {

	private String name = "Pritam Gurung";
	private int rollNum;
	
	void setRollNo(int rollNum) {
		this.rollNum = rollNum;
	}
	
	int getRollNo() {
		return this.rollNum;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	
	
	public static void main(String[] args) {
		Encapsulation enc = new Encapsulation();
		System.out.println(enc.name);
		enc.setName("Prim Chim");
		System.out.println(enc.getName());

	}

}
