package com.ibm.demo.day1.fundas;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks = 37;
		
		if (marks > 100)
			System.out.println("Invalid number");
		else if (marks > 90)
			System.out.println("A grade");
		else if(marks > 80)
			System.out.println("B grade");
		else if (marks > 70)
			System.out.println("C grade");
		else if (marks <1)
			System.out.println("Invalid number");
		else
			System.out.println("pass");
	}

}
