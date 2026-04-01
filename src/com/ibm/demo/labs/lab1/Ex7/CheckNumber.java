package com.ibm.demo.labs.lab1.Ex7;

public class CheckNumber {
	
	public boolean checkNumber(int number){
		
		int prevDigit = 10;

        while (number > 0) {
            int currentDigit = number % 10;

            if (currentDigit > prevDigit) {
                return false;
            }

            prevDigit = currentDigit;
            number = number / 10;
        }

        return true;

}
}
