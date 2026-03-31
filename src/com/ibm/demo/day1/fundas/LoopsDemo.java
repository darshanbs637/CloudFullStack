package com.ibm.demo.day1.fundas;

public class LoopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// for loop,while ,do while,for each loop
// for loop = fixed number of iterations
// otherwise while loop = at least 0 iteration
//,do while loop = at least 1 iteration
		
// for each loop - to iteration through array and collections elements
		
		String[] friends = {"sonu","Monu","Tonu"};
		
		System.out.println("Myfriends using for loop - ");
		for (int i = 0; i<friends.length;i++)
			System.out.println(friends[i]);
		System.out.println("My friends using for each loop");
		
		for(String friend : friends)
			System.out.println(friend);

	}

}
