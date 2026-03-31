package com.ibm.demo.day1.fundas;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Say hi to the user");
		String username = sc.next();
		
		System.out.println("Hi " +username+"!");
		sc.close();
		

	}

}
