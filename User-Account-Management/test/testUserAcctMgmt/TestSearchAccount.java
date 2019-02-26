package testUserAcctMgmt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import userAcctMgmt.userAccount;
import userAcctMgmt.userAccountBag;

class TestSearchAccount {

	@Test
	void testSearchAccount() throws Exception {
		userAccountBag acctBag = new userAccountBag();
	
		System.out.print(acctBag.getListOfAccounts()[2999].getFirstName());
		System.out.println(acctBag.getListOfAccounts()[2999].getLastName());
		
		userAccount acct = new userAccount("Bob", "Simpson", "B", "BobSimpson123", "aB!44444", "3.10");
		boolean actual = acctBag.insertAccount(acct);
		boolean actual2 = acctBag.searchAccount("BobSimpson123", "aB!44444");
		assertEquals(true, actual2);
		System.out.print(acctBag.getListOfAccounts()[2999].getFirstName());
		System.out.println(acctBag.getListOfAccounts()[2999].getLastName());
		System.out.print(acctBag.getListOfAccounts()[3000].getFirstName());
		System.out.println(acctBag.getListOfAccounts()[3000].getLastName());
		
	}

}
