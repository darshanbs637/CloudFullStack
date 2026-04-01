package com.ibm.demo.day3.exception;
import java.util.Scanner;

public class UncheckedException {

	public static void divide() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Int");
		int num1 = sc.nextInt();
		System.out.println("Enter an another Int");
		int num2 = sc.nextInt();
		try{
			System.out.println(num1/num2);
		}catch(ArithmeticException e) {
			System.out.println("Do not divide by 0\ntry again");
			UncheckedException.divide();
		}
		finally {
			sc.close();
		}
	}
		public static void main(String[] args) {
			System.out.println("Start");
			UncheckedException.divide();
			System.out.println("End");
	}

}
