package testUserAcctMgmt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import userAcctMgmt.UserAccount;

class TestEmitId {

	@Test
	void TestEmitId() {
		
		UserAccount acct = new UserAccount();
		String actual = "0";
		String j = "0";
		for(int i = 0; i < 4; i++) {
			j = acct.emitID();
		}
		
		actual = j;
		
		assertEquals("10000004", actual);
	}

}