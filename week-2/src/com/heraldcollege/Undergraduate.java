package com.heraldcollege;

public class Undergraduate extends Student{
	
	Undergraduate(String name, int rollNo){
		super(name,rollNo);
	}

	String nameString = "Herald";
	String nameString2 = "Herald";
	String nameString3 = new String("herald");
	public static void main(String[] args) {
		
		Undergraduate ugrad = new Undergraduate("Pritam",14);
		System.out.println(ugrad.nameString);
		System.out.println(ugrad.nameString2);
		System.out.println(ugrad.getName());
	}

}