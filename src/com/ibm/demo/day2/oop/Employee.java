package com.ibm.demo.day2.oop;

public class Employee {
	
	int id;
	String name;
	double salary;
	
	
	public Employee() {
		System.out.println("default Constructor");
	}
		
		public Employee(int id,String name) {
			System.out.println("default Constructor");
			
			this.id = id;
			this.name = name;
		}
		public Employee(int id,String name,double salary){
			System.out.println("Parameter constructor");
			
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}

	
}
