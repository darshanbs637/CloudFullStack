package com.ibm.demo.day1.oops;

public class Employee {

	
	static int officephone;
		//class Level fields
		int id;
		String name;
		double salary;
//		long[] phones;
//		Address address;
		
		
		void work() {
			System.out.println("Employee " + name + " is working");
		}


		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}

	}

