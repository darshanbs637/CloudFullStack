package com.ibm.demo.day2.access;

public class AccessSpecifiersDemo {
	
	
	//finalkeyword -
	//final field - can not reassign a value
	//final method - can not be overridden
	//final method -  can be inherited
// what is the difference between final and finalize?////import.
	static final int finaleFields = 10;
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(AccessSpecifiersDemo.finaleFields);
		
		System.out.println(Integer.MAX_VALUE);
		
		

	}

}
