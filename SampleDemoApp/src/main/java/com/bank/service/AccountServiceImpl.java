package com.bank.service;

import com.bank.beans.Account;
import com.bank.exceptions.AccountCreationFaliedException;
import com.bank.exceptions.AccountNotFoundException;
import com.bank.repo.AccountRepo;
import com.bank.util.AccountNumberGenerator;

public class AccountServiceImpl implements AccountService {

	private AccountRepo repo;

	public AccountServiceImpl(AccountRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Account createAccount(int amount) throws AccountCreationFaliedException {

		if (amount < 500) {
			throw new AccountCreationFaliedException();
		}
		int accountNumber = AccountNumberGenerator.getNewAccountNumber();
		Account a = new Account(accountNumber, amount);
		if (repo.save(a)) {
			return a;
		}
		throw new AccountCreationFaliedException();
	}

	@Override
	public Account showBalance(int accountNumber) throws AccountNotFoundException {
		Account a = null;
		if ((a = repo.find(new Account(accountNumber))) != null) {

			return a;
		}
		throw new AccountNotFoundException();
	}

}
