package com.fis.looslycoupled;

public class Account implements IAccount {
	
	public void withDraw(double amount,int pinCode){
		if(checkPinCode(pinCode)){
			if(checkTransactionLimit()){
				System.out.println("Amount WithDraw "+amount);
			}
			else
			{
				System.out.println("Transcation Not There....");
			}
		}
		else
		{
			System.out.println("Invalid Pincode....");
		}
		
	}
	
	public boolean checkTransactionLimit(){
		return true;
	}
	
	public boolean checkPinCode(int pinCode){
		if(pinCode>1000 && pinCode<2000){
			return true;
		}
		else
		{
			return false;
		}
	}

}
