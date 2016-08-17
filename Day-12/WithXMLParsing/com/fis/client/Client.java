package com.fis.client;

import com.fis.looslycoupled.Account;
import com.fis.looslycoupled.AccountFactory;
import com.fis.looslycoupled.IAccount;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IAccount account = new Account();
		IAccount account = AccountFactory.getAccount();
		account.withDraw(9000, 1111);
		//account.checkPinCode(1111);

	}

}
