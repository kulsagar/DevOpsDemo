package com.bank.test;

import static org.junit.Assert.assertTrue;


import org.junit.Test;

import com.bank.beans.Account;
import com.bank.exceptions.AccountCreationFaliedException;
import com.bank.exceptions.AccountNotFoundException;
import com.bank.repo.AccountRepoImpl;
import com.bank.service.AccountService;
import com.bank.service.AccountServiceImpl;

public class AccountServiceTest {
	private AccountService service = new AccountServiceImpl(new AccountRepoImpl());

	@Test
	public void whileCreatingAccountIfAmountIsGreaterThan500ThenAccountShouldBeCreatedSuccessfully()
			throws AccountCreationFaliedException {
		Account a = service.createAccount(1000);
		assertTrue("Success", a.getBalance() == 1000);
	}

	@Test(expected = AccountCreationFaliedException.class)
	public void whileCreatingAccountIfAmountIsLessThan500ThenAccountCreationFailedExceptionShouldBeThrown()
			throws AccountCreationFaliedException {
		service.createAccount(100);

	}

	@Test
	public void GivenAccountIsValidAccountWhenShowBalanceIsCalledByPassingValidAccountNumberThenAccountBeanShouldBeReturned()
			throws AccountCreationFaliedException, AccountNotFoundException {
		Account a = service.createAccount(2000);
		assertTrue("Success", service.showBalance(a.getAccountNumber()).getBalance() == 2000);

	}

	@Test(expected = AccountNotFoundException.class)
	public void WhenShowBalanceIsCalledByPassingInvalidAccountNumberThenMethodShouldThrowException()
			throws AccountCreationFaliedException, AccountNotFoundException {
		service.showBalance(2345);
	}
}
