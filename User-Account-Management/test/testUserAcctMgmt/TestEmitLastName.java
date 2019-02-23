package testUserAcctMgmt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import userAcctMgmt.userAccount;

class TestEmitLastName {

	@Test
	void testEmitLastName() {
		userAccount acct = new userAccount();
		String[] listOfLastNames = new String[3];
		String ln = "Joe";
		String ln2 = "Ebro";
		String ln3 = "Rosenberg";
		listOfLastNames[0] = ln;
		listOfLastNames[1] = ln2;
		listOfLastNames[2] = ln3;
		String lastName = acct.emitLastName(listOfLastNames);
		System.out.print(lastName );
	}

}
