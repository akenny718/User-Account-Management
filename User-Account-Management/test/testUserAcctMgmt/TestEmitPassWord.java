package testUserAcctMgmt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import userAcctMgmt.UserAccount;

class TestEmitPassWord {

	@Test
	void testEmitPassWord() {
		UserAccount acct = new UserAccount();
		String actual = acct.emitPassword();
		System.out.println(actual);
	}

}
