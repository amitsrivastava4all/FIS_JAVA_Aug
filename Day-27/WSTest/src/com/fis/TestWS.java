package com.fis;

import net.webservicex.Currency;
import net.webservicex.CurrencyConvertor;
import net.webservicex.CurrencyConvertorSoap;

public class TestWS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calling WebService...");
		CurrencyConvertor currencyObject = new CurrencyConvertor();
		double rate = currencyObject.getCurrencyConvertorSoap().conversionRate(Currency.EUR, Currency.INR);
		System.out.println("Rate is "+rate);
	}

}
