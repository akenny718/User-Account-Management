package testUserAcctMgmt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import userAcctMgmt.userAccount;

class TestCheckPassWord {

	@Test
	void testCheckPassWord() {
		userAccount acct = new userAccount();
		String passWord = "aB!34567";
	    boolean actual = acct.checkPassWord(passWord);
		assertEquals(true, actual);
	}

}
