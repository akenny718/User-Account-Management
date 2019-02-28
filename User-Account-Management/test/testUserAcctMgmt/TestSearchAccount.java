package testUserAcctMgmt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import userAcctMgmt.UserAccount;
import userAcctMgmt.UserAccountBag;
import java.util.Scanner;

class TestSearchAccount {

	@Test
	void testSearchAccount() throws Exception {
		UserAccountBag acctBag = new UserAccountBag();
		///Scanner input = new Scanner(System.in);
	
		System.out.print(acctBag.getListOfAccounts()[2999].getFirstName());
		System.out.println(acctBag.getListOfAccounts()[2999].getLastName());
		
		//userAccount acct = new userAccount("Bob", "Simpson", "B", "aB!44444", "3.10");
		//boolean actual = acctBag.insertAccount(acct);
	    //boolean actual2 = acctBag.searchAccount("SimpB1", "aB!44444");
		//assertEquals(true, actual2);
		//System.out.print(acctBag.getListOfAccounts()[2999].getFirstName());
		//System.out.println(acctBag.getListOfAccounts()[2999].getLastName());
		//System.out.print(acctBag.getListOfAccounts()[3000].getFirstName());
		//System.out.println(acctBag.getListOfAccounts()[3000].getLastName());
		//System.out.println(acctBag.getListOfAccounts()[3000].getUserName());
		
	}

}
