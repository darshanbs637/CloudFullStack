package com.ibm.demo.labs.lab1.Ex5;

public class CaluculateSum {
	
	public int CaluculateSum(int n){
		int Sum = 0;
		
		for(int i=1;i<=n;i++) {
		if(i%3==0 || i%5==0){
			
			Sum += i;			
	}
}
return Sum;
}
}