package userAcctMgmt;

public class Name {

	private String firstName;
	private String lastName;
	private String gender;
	private Name[] listOfBoysNames = new Name[27];
	private Name[] listOfGirlsNames = new Name[28];
	private String[] listOfLastNames = new String[55];
	private Name[] listOfAllFirstNames = new Name[55];


	Name(){

	}


	Name(String firstName, String lastName, String gender){
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}



	/*public Name[] getListOfBoysNames() {
		setListOfBoysNames();
		return listOfBoysNames;
	}*/


	public void setListOfBoysNames() {

	for(int i = 0; i < listOfBoysNames.length; i++) {
		Name boyName = new Name();
		boyName.setFirstName("FromText");
		boyName.setGender("B");
		this.listOfBoysNames[i] = boyName;
	  }
	
    }


	/*public Name[] getListOfGirlsNames() {
		setListOfGirlsNames();
		return listOfGirlsNames;
	}*/


	public void setListOfGirlsNames() {
	
	for(int i = 0; i < listOfGirlsNames.length; i++) {
		Name girlName = new Name();
		girlName.setFirstName("FromText");
		girlName.setGender("G");
		this.listOfGirlsNames[i] = girlName;
	}
		
	}


	public String[] getListOfLastNames() {
		setListOfLastNames();
		return listOfLastNames;
	}


	public void setListOfLastNames() {
		
		for(int i = 0; i < listOfLastNames.length; i++) {
		    lastName = "FromText";
			this.listOfLastNames[i] = lastName;
		}
	}


	public Name[] getListOfAllFirstNames() {
		setListOfAllFirstNames();
		return listOfAllFirstNames;
	}


	public void setListOfAllFirstNames() {
		
	    int  i = 0;
	    int j = 0;
	    
	    setListOfBoysNames();
	    setListOfGirlsNames();
		
		while(i < listOfBoysNames.length) {
			listOfAllFirstNames[i] = listOfBoysNames[i];
		i++;
		}
		
		while(j < listOfGirlsNames.length) {
			listOfAllFirstNames[i] = listOfGirlsNames[j];
			i++;
			j++;
		}
		
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}
	
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}



}
