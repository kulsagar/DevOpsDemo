package com.bank.util;

public class AccountNumberGenerator {

	private static int accountCounter = 1;
	private AccountNumberGenerator(){}
	

	public static int getNewAccountNumber() {
		return accountCounter++;
	}
}
