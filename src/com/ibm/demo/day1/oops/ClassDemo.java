package com.ibm.demo.day1.oops;

public class ClassDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int            num   =    10    ;
		//Tokens// 1. datatype 2.var,3.op,4.val,5.sep
				
				Employee emp = new Employee();
				emp.id = 1;
				emp.name = "Sonu";
				emp.salary = 90000;
//				System.out.println(emp.id + " "+ emp.name+" "+emp.salary);
				System.out.println(emp.toString());
				emp.work();
				
				Employee emp2 = new Employee();
				emp2.id = 2;
				emp2.name = "Tonu";
				emp2.salary = 92000;
//				System.out.println(emp2.id + " "+ emp2.name+" "+emp2.salary);
				System.out.println(emp2.toString());
				emp2.work();

	}

}
