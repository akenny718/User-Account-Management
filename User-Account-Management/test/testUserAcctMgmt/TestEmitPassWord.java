package testUserAcctMgmt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import userAcctMgmt.userAccount;

class TestEmitPassWord {

	@Test
	void testEmitPassWord() {
		userAccount acct = new userAccount();
		String actual = acct.emitPassword();
		System.out.println(actual);
	}

}
