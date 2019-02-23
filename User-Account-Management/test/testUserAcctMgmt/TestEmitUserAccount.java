package testUserAcctMgmt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import userAcctMgmt.userAccount;

class TestEmitUserAccount {

	@Test
	void testEmitUserAccount() throws Exception {
		userAccount acct = new userAccount();
		System.out.print(acct.emitUserAccount().getFirstName());
	}

}
