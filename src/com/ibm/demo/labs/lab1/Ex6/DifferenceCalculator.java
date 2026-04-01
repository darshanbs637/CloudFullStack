package com.ibm.demo.labs.lab1.Ex6;

public class DifferenceCalculator {
	
	public int calculateDifference(int n) {
		int sumofSquare = 0;
		int sum = 0;
		
		
		for (int i = 0;i<=n;i++) {
			sumofSquare += i*i;
			sum += i;
			
		}
		
		int Square = sum*sum;
		
		return sumofSquare - Square;
	}

}
