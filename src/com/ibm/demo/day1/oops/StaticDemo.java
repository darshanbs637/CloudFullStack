package com.ibm.demo.day1.oops;

public class StaticDemo {
	
	
	//static fields -belong to class - common to all objects
	//==free access - access as class className,FieldName
	static int num1 =10;
	int num2 = 20;
	//instance fields - belong to object -unique to each object
	//==restricted access - access as ovjectName.fieldName

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static field - access as className.fieldName
		System.out.println(StaticDemo.num1);
		//instance field - access as objectName.fieldName
		StaticDemo obj = new StaticDemo();
		
		System.out.println(obj.num2);
//		System.out.println(obj.num1);

	}

}
