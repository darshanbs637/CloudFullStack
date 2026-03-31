package com.ibm.demo.day2.access;

public class FieldsDemo {
	
	static int staticfield = 10;
	int instancefield = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----main method------");
		
		int localfield = 30;
		System.out.println(FieldsDemo.staticfield);
//		FieldsDemo obj = new FieldsDemo();
//		obj.instanceMethod();
		System.out.println(localfield); 
		

	}

}
