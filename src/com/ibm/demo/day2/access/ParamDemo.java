package com.ibm.demo.day2.access;

public class ParamDemo {
	
	public static void main(String[] args) {
		System.out.println("----main method------");
		Methods.withArgs(10,20);
		Methods.noArgs();
		Methods.withReturnNoargs();
		Methods.withReturnWithArgs(20, 50);
		
	}

}

class Methods{
	
	static void withArgs(int i,int j) {
		System.out.println(i+j);
		
	}
	
	static void noArgs() {
		System.out.println(0);
	}
	
	
	static int withReturnWithArgs(int i,int j) {
		return i+j;
	}
	
	static int withReturnNoargs() {
		return 100;
	}
}
