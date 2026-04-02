package com.ibm.demo.day3.collectionsdemo;

import java.util.List;
import java.util.ArrayList;

public class CollectionsDemo {
	
	public static void main(String[] args) {
//     ArrayList myFriends = newArrayList();
//      List<String> myFrineds = new ArrayListString();
		List<String> myFriends = new ArrayList<>();
		
		
		System.out.println("size" +myFriends.size());
		System.out.println(myFriends);
		myFriends.add("sonu");
		myFriends.add("Monu");
		
		System.out.println("Size "+myFriends.size());
		System.out.println(myFriends);
		myFriends.add("Tonu");
//		myFriends.add(10.50);
//		myFriends.add(20);
//		myFriends.add(false);
		System.out.println("Size "+myFriends.size());
		System.out.println(myFriends);
			
		
	}

}
