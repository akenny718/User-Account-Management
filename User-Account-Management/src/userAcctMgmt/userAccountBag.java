package userAcctMgmt;

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
		for(int i = 0; i < next; i++) {
			
			if(listOfAccounts[i].getUserName() == newAcct.getUserName()) {
				return false;
			}
		}
		
		listOfAccounts[next] = newAcct;
		next++;
		
		return true;
	}
	


	public boolean searchAccount(String username, String password){
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


	
	
	
	

}
