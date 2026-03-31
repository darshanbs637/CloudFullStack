package com.ibm.demo.day1.oop.method;

public class MedthodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
        double piValue = Calc.pi();
        System.out.println("Value of pi: " + piValue);
        
        int sum = Calc.addNums(10, 5);
        
        System.out.println("Sum: " + sum);
        
        
        Calc.addPrintNums(7, 3);
        System.out.print("Sum using addPrintNums: ");
        
        Calc calcObj = new Calc();
        int difference = calcObj.subtract(20, 8);
        
        System.out.println("Difference: " + difference);
		

	}

}
