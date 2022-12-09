package student;

public class Student {
//	 method name 
	
	@Deprecated  // code that is 
	void study(String value) {
		System.out.println(value);
	}
	
	void study() {
		System.out.println("hello world");
	}
	
	void study(String value, int values) {
		System.out.println("double values "+value+values);
	}
	
	void study(int value, String values) {
		System.out.println("double values "+value+values);
	}
	
}

class Graduate extends Student{
	
	@Override
	protected void study() {
		System.out.println("bye bye");
	}
	
}

class StudentMain{
	
	public static void main(String[] args) {
		Student student = new Student();
		
		student.study("First method");
		student.study();
		student.study(10, "all");
		student.study("this is new", 15);
		
	}
}

// override
// for same method signature there must be same data type in primitive data type
// method overload
