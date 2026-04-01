package com.ibm.demo.day2.oop;


/*
 * 
 * Constructor is a type of method name is same as class name
 * use needed to create an object
 */

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----main---");
		
		Employee emp1 = new Employee();
		emp1.id = 1;
		emp1.name = "Sonu";
		emp1.salary = 900000;
		System.out.println(emp1.toString());
		
		Employee emp2 = new Employee(3,"Tonu",920000);
		System.out.println(emp2.toString());
		
		Employee emp3 = new Employee(4,"Sonu");
		System.out.println(emp3.toString());
		
		
	}

}
