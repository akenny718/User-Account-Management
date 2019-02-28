package userAcctMgmt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class userAccountBag {
	
	private int size;
	private int next;
	private userAccount[] listOfAccounts;
	
	
	public userAccountBag() throws Exception {
		// TESTED //
		next = 0;
		listOfAccounts = new userAccount[5000];
		userAccount newAcct = new userAccount();
		
		for(int i = 0; i < 3000; i++) {
			listOfAccounts[next] = newAcct.emitUserAccount();
			next++;
		}
	}
	
	
	public userAccountBag(int size) {
		next = 0;
		this.size = size;
		listOfAccounts = new userAccount[size];
	}
	
	
	
	public boolean insertAccount(userAccount newAcct) {
		
        // TESTED //
		listOfAccounts[next] = newAcct;
		next++;
		return true;
	}
	


	public boolean searchAccount(String userName, String passWord){
		 
		    // TESTED //
		    userAccount node;
	        userAccount temp;
	        // access the node using a sequential search
	        int i = 0;
	        while (i < next && !listOfAccounts[i].getUserName().equals(userName)) {
	            i++;
	        }
	        if (i == next){ // node not found
	            return false;
	        }
	        
	        if(!listOfAccounts[i].getPassword().equals(passWord)) {
	        	return false;
	        }
	        
	        node = listOfAccounts[i];
	        // move the node up one position in the array, unless it is the first node
	        if (i != 0){ // bubble-up accessed node
	            temp = listOfAccounts[i - 1];
	            listOfAccounts[i - 1] = listOfAccounts[i];
	            listOfAccounts[i] = temp;
	        }
		return true;
	}


	public boolean searchAccount(String username){
		return true;
	}

	
	
	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public int getNext() {
		return next;
	}


	public void setNext(int next) {
		this.next = next;
	}


	public userAccount[] getListOfAccounts() {
		return listOfAccounts;
	}


	public void setListOfAccounts(userAccount[] listOfAccounts) {
		this.listOfAccounts = listOfAccounts;
	}
	
	
	
	
	 /* public void save(){

	    	try (ObjectOutputStream ofo = new ObjectOutputStream(new FileOutputStream("userAccountBag.data")) ) {

	    		ofo.writeObject(this);
	   			userAccount acct = new userAccount();
	   			ofo.writeInt(acct.getID());
	   			System.out.println("Save successful");
	   			ofo.close();
	   		}
	    	catch (IOException e) {
				e.printStackTrace();
			}

	    }




		public userAccountBag load(){

	    	try ( ObjectInputStream ofi = new ObjectInputStream(new FileInputStream("userAccountBag.data")) ) {

	    		userAccountBag restoredAcctBag = (userAccountBag)ofi.readObject();
	    		userAccount acct = new userAccount();
	    		acct.setID(ofi.readInt());
	   			ofi.close();
	   			return restoredAcctBag;

	    	} catch (ClassNotFoundException e) {
				//e.printStackTrace();
				return null;

	    	} catch (IOException e) {
				//e.printStackTrace();
				return null;
			}

	    }*/


}
