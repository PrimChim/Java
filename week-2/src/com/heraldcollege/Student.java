package com.heraldcollege;

public class Student {
	
	// properties instance variable
	private String name="Parent";
	private int rollNo;
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	
	void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	int getRollNo() {
		return this.rollNo;
	}
	
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

}
