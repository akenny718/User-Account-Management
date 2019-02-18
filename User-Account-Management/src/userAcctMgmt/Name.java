package userAcctMgmt;

public class Name {

	private String firstName;
	private String lastName;
	private String gender;
	private int boyIndex = 0; // MAY NEED TO BE STATIC
	private int girlIndex = 0; // MAY NEED TO BE STATIC
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



	public Name[] getListOfBoysNames() {
		return listOfBoysNames;
	}


	public void setListOfBoysNames() {

		Name boyName = new Name();
		boyName.setFirstName("FromText");
		boyName.setGender("B");
		this.listOfBoysNames[boyIndex] = boyName;
		boyIndex++;
    }


	public Name[] getListOfGirlsNames() {
		return listOfGirlsNames;
	}


	public void setListOfGirlsNames(Name[] girlsNames) {
		this.listOfGirlsNames = girlsNames;
	}


	public String[] getListOfLastNames() {
		return listOfLastNames;
	}


	public void setListOfLastNames(String[] lastNames) {
		this.listOfLastNames = lastNames;
	}


	public Name[] getListOfAllFirstNames() {
		return listOfAllFirstNames;
	}


	public void setListOfAllFirstNames() {
		//this.listOfAllNames;
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


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}



}
