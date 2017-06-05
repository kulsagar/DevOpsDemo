package com.bank.beans;

/*
 *  DevOps demo - Account Pojo created by Sagar on 24/05/2017
 * 
 */
public class Account {

	private int accountNumber;
	private float balance;

	public Account(int accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}

	public Account(int accountNumber, int amount) {
		this.accountNumber = accountNumber;
		this.balance = amount;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}

	// This is to test bitbucket repo.
}
