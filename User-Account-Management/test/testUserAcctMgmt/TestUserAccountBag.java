package testUserAcctMgmt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import userAcctMgmt.UserAccount;
import userAcctMgmt.UserAccountBag;

class TestUserAccountBag {

	@Test
	void testUserAccountBag() throws Exception {
		UserAccountBag acctBag = new UserAccountBag();
		//int actual = 3000;
		//assertEquals(3000, actual);
		System.out.print(acctBag.getListOfAccounts()[2000].getFirstName());
		System.out.println(acctBag.getListOfAccounts()[2000].getLastName());
		String userName = acctBag.getListOfAccounts()[2000].getUserName();
		UserAccount acct = new UserAccount("Bob", "Simpson", "B", "aB!44444", "3.10");
		boolean actual = acctBag.insertAccount(acct);
		//assertEquals(true, actual);
		System.out.print(acctBag.getListOfAccounts()[3000].getFirstName());
	}

}
