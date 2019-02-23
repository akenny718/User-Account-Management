package testUserAcctMgmt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import userAcctMgmt.userAccount;
import userAcctMgmt.Name;

class TestEmitFirstName {

	@Test
	void test() throws Exception {
	  Name name = new Name();
	  
	  Name[] listOfAllFirstNames = name.getListOfAllFirstNames();
	  String[] listOfLastNames = name.getListOfLastNames();
	  userAccount acct = new userAccount();
	  
	//System.out.print(acct.emitFirstName(listOfAllFirstNames).getFirstName());
	//System.out.print(acct.emitLastName(lastNames));
	  
	  name = acct.emitFirstName(listOfAllFirstNames);
	  name.setLastName(acct.emitLastName(listOfLastNames));
	  
	  userAccount newAcct = new userAccount(name);
	  
	  System.out.print(newAcct.getFirstName());
	  System.out.println(newAcct.getLastName());
	  System.out.println(newAcct.getGender());
	  System.out.println(newAcct.getiD());
	  System.out.println(newAcct.getUserName());
	  System.out.println(newAcct.getPassword());
	  System.out.println(newAcct.getGpa());
	}

}
