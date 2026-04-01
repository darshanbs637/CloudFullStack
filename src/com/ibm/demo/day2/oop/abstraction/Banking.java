package com.ibm.demo.day2.oop.abstraction;


//Real time use of abstract methods

abstract class Rbi{
	abstract void doKyc();
}

interface FinanceMinister{
	
}

interface StateGovt{
	
}

class HdfcBank extends Rbi implements FinanceMinister,StateGovt{

	@Override
	void doKyc() {
		// TODO Auto-generated method stub
		System.out.println("KYC with Aadhaar");
		
	}
	
}

class IciciBank extends Rbi{

	@Override
	void doKyc() {
		// TODO Auto-generated method stub
		System.out.println("KYC with PAN");
	}
	
}
public abstract class Banking {

}
