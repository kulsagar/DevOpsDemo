package com.bank.repo;

import com.bank.beans.Account;

public interface AccountRepo {

	boolean save(Account a);

	Account find(Account a);
}
