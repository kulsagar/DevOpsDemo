package com.bank.service;

import com.bank.beans.Account;
import com.bank.exceptions.AccountCreationFaliedException;
import com.bank.exceptions.AccountNotFoundException;

public interface AccountService {

	Account createAccount(int amount) throws AccountCreationFaliedException;

	Account showBalance(int accountNumber) throws AccountNotFoundException;
}
