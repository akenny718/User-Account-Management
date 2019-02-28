package testUserAcctMgmt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import userAcctMgmt.UserAccount;

class TestCheckPassWord {

	@Test
	void testCheckPassWord() {
		UserAccount acct = new UserAccount();
		String passWord = "aB!34567";
	    boolean actual = acct.checkPassWord(passWord);
		assertEquals(true, actual);
	}

}
