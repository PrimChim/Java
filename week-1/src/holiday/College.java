package holiday;

public class College {
	
	String name;
	String address;
	int num;
	
	College(String name, String address, int num){
		this.name = name;
		this.address = address;
		this.num = num;
	}
	
	void printName() {
		System.out.println(this.name);
		System.out.println(this.address);
	}
	
	int number() {
		return this.num;
	}

	public static void main(String[] args) {
		
		College clzz = new College("Herald", "Naxal", 9800000);
		clzz.printName();
		System.out.println(clzz.number());

	}

}
