package testUserAcctMgmt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import userAcctMgmt.userAccount;

class TestEmitUserId {

	@Test
	void testEmitUserId() {
		
		userAccount acct = new userAccount();
		String actual = acct.emitUserName("Arthur", "Oi", "10000003");
		assertEquals("OiA3", actual);
	}

}
