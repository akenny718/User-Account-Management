package testUserAcctMgmt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import userAcctMgmt.userAccount;

class TestEmitId {

	@Test
	void TestEmitId() {
		
		userAccount acct = new userAccount();
		String actual = "0";
		String j = "0";
		for(int i = 0; i < 4; i++) {
			j = acct.emitID();
		}
		
		actual = j;
		
		assertEquals("10000004", actual);
	}

}