package userAcctMgmt;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestEmitGPA {

	@Test
	// TEST DOES NOT NEED TO BE EQUAL TO EXPECTED, OBSERVE
	// FAILURE TRACE TO ASSERT THAT ACTUAL IS RETURNING
	// DOUBLE VALUES LESS THAN 5.00 AND GREATER THAN 0.00
	public void emitGPATest() {
		userAccount acct = new userAccount();
		double actual = acct.emitGPA();
		assertEquals(4.0, actual, 0.0);
	}

}
