package com.bank.util;

public class AccountNumberGenerator {

	private static int accountCounter = 1;

	public static int getNewAccountNumber() {
		return accountCounter++;
	}
}
