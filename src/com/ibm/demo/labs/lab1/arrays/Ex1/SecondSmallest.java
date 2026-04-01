package com.ibm.demo.labs.lab1.arrays.Ex1;
import java.util.Arrays;

public class SecondSmallest {
	
	public int getSecondSmallest(int []arr) {
		Arrays.sort(arr);
		return arr[1];
	}
	
	
	

}
