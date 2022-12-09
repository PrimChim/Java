package holiday;

public class Demo {

	String nameString;
	int roll;
	String sectionString;

	Demo(String name,int rollNum,String sec){
		nameString = name;
		roll = rollNum;
		sectionString = sec;
		
	}
	
	void studentName() {
		System.out.println(nameString);
	}
	
	int rollNum() {
		return roll;
	}
	
	public static void main(String[] args) {
		
		Demo myObj = new Demo("Pritam",14,"L5CG5");

//		System.out.println(myObj.nameString);
		
		myObj.studentName();
		
		System.out.println(myObj.rollNum());
		
	}

}
