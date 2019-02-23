package testUserAcctMgmt;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import userAcctMgmt.userAccount;

class TestEmitGPA {

	@Test
	// TEST DOES NOT NEED TO BE EQUAL TO EXPECTED, OBSERVE
	// FAILURE TRACE TO ASSERT THAT ACTUAL IS RETURNING
	// DOUBLE VALUES LESS THAN 5.00 AND GREATER THAN 0.00
	public void emitGPATest() {
		userAccount acct = new userAccount();
		String actual = acct.emitGPA();
		assertEquals("4.00", actual, 0.00);
	}

}
