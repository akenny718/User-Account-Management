package testUserAcctMgmt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import userAcctMgmt.UserAccount;

class TestEmitUserAccount {

	@Test
	void testEmitUserAccount() throws Exception {
		UserAccount acct = new UserAccount();
		System.out.print(acct.emitUserAccount().getFirstName());
	}

}
