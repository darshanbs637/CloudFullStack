package com.ibm.demo.day2.access;

public class LocalDemo {
	
	static int staticfield = 10;//free access to all methods
	int instancefield = 20;
	
	static void staticMethod() {
		System.out.println("this os from main method");
	
		
		LocalDemo obj = new LocalDemo();//create a object for instance method 
		obj.instanceMethod();
		System.out.println("This os from as Static Method");
		System.out.println(LocalDemo.staticfield);
		System.out.println(obj.instancefield);
	}
	
	void instanceMethod() {
		System.out.println("this is from an instance method");
		System.out.println(LocalDemo.staticfield);
		System.out.println(instancefield);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDemo.staticMethod();//in static direct class name cal
		LocalDemo obj = new LocalDemo();// need to create a obj in instance class to cal
		obj.instanceMethod();
		System.out.println(staticfield);
		System.out.println(obj.instancefield);
		
		

	}

}
