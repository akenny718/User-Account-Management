package testUserAcctMgmt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import userAcctMgmt.Name;

class TestSetListOfLastNames {

	@Test
	void testSetListOfLastNames() throws Exception {
        Name n = new Name();
		
		String[] lastNames = n.getListOfLastNames();
		
		for(int i = 0; i < 55; i++) {
			System.out.println(lastNames[i]);
		}
	}

}
