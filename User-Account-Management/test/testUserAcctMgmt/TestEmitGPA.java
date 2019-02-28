package testUserAcctMgmt;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import userAcctMgmt.UserAccount;

class TestEmitGPA {

	@Test
	// TEST DOES NOT NEED TO BE EQUAL TO EXPECTED, OBSERVE
	// FAILURE TRACE TO ASSERT THAT ACTUAL IS RETURNING
	// DOUBLE VALUES LESS THAN 5.00 AND GREATER THAN 0.00
	public void emitGPATest() {
		UserAccount acct = new UserAccount();
		String actual = acct.emitGPA();
		assertEquals("4.0", actual, 0.0);
	}

}
