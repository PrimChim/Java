package heraldcollege;

public class Student {
	
	// properties instance variable
	String name;
	int rollNo;
	
	// methods
	int result() {
		return 99;
	}
	String section() {
		return this.name;
	}
	
	// constructor
	Student(String name, int rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}

	public static void main(String[] args) {
		Student std = new Student("Pritam Gurung",14);
		System.out.println(std.section());
		System.out.println(std.result());
		
		// from Encapsulation.java
		Encapsulation enc = new Encapsulation();
		enc.setName("Prim Chim");
		System.out.println(enc.getName());
		
	}

}
