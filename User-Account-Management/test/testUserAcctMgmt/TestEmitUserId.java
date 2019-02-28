package testUserAcctMgmt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import userAcctMgmt.UserAccount;
import userAcctMgmt.UserAccount;

class TestEmitUserId {

	@Test
	void testEmitUserId() {
		
		UserAccount acct = new UserAccount();
		String actual = acct.emitUserName("Arthur", "Oi", "10000003");
		assertEquals("OiA3", actual);
	}

}
