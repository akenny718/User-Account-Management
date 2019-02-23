package testUserAcctMgmt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import userAcctMgmt.Name;

class TestSetListOfGirlsNames {

	@Test
	void testSetListOfGirlsNames() throws Exception {
		Name n = new Name();
		
		Name[] names = n.getListOfAllFirstNames();
		
		for(int i = 0; i < 28; i++) {
			System.out.println(names[i].getFirstName());
		}
	}

}
