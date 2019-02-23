package testUserAcctMgmt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import userAcctMgmt.Name;

class TestSetListOfAllFirstNames {

	@Test
	void testSetListOfAllFirstNames() throws Exception {
        Name n = new Name();
		
		Name[] names = n.getListOfAllFirstNames();
		
		for(int i = 0; i < 55; i++) {
			System.out.println(names[i].getFirstName());
		}
	}

}
