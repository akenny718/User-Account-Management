package testUserAcctMgmt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import userAcctMgmt.userAccount;

class TestCheckGPAEntry {

	@Test
	void testCheckGPAEntry() {
		userAccount acct = new userAccount();
		String gpa = "4.2+";
		boolean actual = acct.checkGPAEntry(gpa);
		assertEquals(false, actual);
	}

}
