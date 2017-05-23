package com.bank.repo;

import java.util.HashMap;
import java.util.Map;

import com.bank.beans.Account;

public class AccountRepoImpl implements AccountRepo {

	private Map<Integer, Account> accountCollection;

	public AccountRepoImpl() {
		super();

		accountCollection = new HashMap<Integer, Account>();
	}

	@Override
	public boolean save(Account a) {
		if (!accountCollection.containsKey(a.getAccountNumber())) {
			accountCollection.put(a.getAccountNumber(), a);
			return true;
		}

		return false;
	}

	@Override
	public Account find(Account a) {
		return accountCollection.get(a.getAccountNumber());
	}

}
