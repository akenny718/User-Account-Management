package testUserAcctMgmt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import userAcctMgmt.userAccount;
import userAcctMgmt.userAccountBag;

class TestUserAccountBag {

	@Test
	void testUserAccountBag() throws Exception {
		userAccountBag acctBag = new userAccountBag();
		//int actual = 3000;
		//assertEquals(3000, actual);
		System.out.print(acctBag.getListOfAccounts()[2000].getFirstName());
		System.out.println(acctBag.getListOfAccounts()[2000].getLastName());
		String userName = acctBag.getListOfAccounts()[2000].getUserName();
		userAccount acct = new userAccount("Bob", "Simpson", "B", "BobSimpson123", "aB!44444", "3.10");
		boolean actual = acctBag.insertAccount(acct);
		//assertEquals(true, actual);
		System.out.print(acctBag.getListOfAccounts()[3000].getFirstName());
	}

}
