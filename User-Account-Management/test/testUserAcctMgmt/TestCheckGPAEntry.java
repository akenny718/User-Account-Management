package testUserAcctMgmt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import userAcctMgmt.UserAccount;
import userAcctMgmt.UserAccount;

class TestCheckGPAEntry {

	@Test
	void testCheckGPAEntry() {
		UserAccount acct = new UserAccount();
		String gpa = "4.2+";
		boolean actual = acct.checkGPAEntry(gpa);
		assertEquals(false, actual);
	}

}
