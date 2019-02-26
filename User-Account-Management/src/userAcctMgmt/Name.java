package userAcctMgmt;
import java.io.BufferedReader;
import java.io.FileReader;

public class Name {

	private String firstName;
	private String lastName;
	private String gender;
	private Name[] listOfBoysNames = new Name[27];
	private Name[] listOfGirlsNames = new Name[28];
	private String[] listOfLastNames = new String[55];
	private Name[] listOfAllFirstNames = new Name[55];


	public Name(){

	}


	public Name(String firstName, String lastName, String gender){
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}


	public void setListOfBoysNames() throws Exception {
		
		// TESTED //
		FileReader file = new FileReader("C:/Users/kasin/Desktop/boys_names.txt");
		BufferedReader reader = new BufferedReader(file);
		
		String text = "";
		String line = reader.readLine();

	for(int i = 0; i < listOfBoysNames.length; i++) {
		
		text = line;
		String[] s = text.split(" ");
		Name boyName = new Name();
		boyName.setFirstName(s[0]);
		boyName.setGender("B");
		this.listOfBoysNames[i] = boyName;
		line  = reader.readLine();
	  }
	
	    reader.close();
    }


	public void setListOfGirlsNames() throws Exception {
	
		// TESTED //
		FileReader file = new FileReader("C:/Users/kasin/Desktop/girls_names.txt");
		BufferedReader reader = new BufferedReader(file);
		
		String text = "";
		String line = reader.readLine();

	for(int i = 0; i < listOfGirlsNames.length; i++) {
		
		text = line;
		String[] s = text.split(" ");
		Name girlName = new Name();
		girlName.setFirstName(s[0]);
		girlName.setGender("G");
		this.listOfGirlsNames[i] = girlName;
		line  = reader.readLine();
	  }
	
	    reader.close();
		
	}


	public String[] getListOfLastNames() throws Exception {
		setListOfLastNames();
		return listOfLastNames;
	}


	public void setListOfLastNames() throws Exception {
		
		// TESTED //
		FileReader file = new FileReader("C:/Users/kasin/Desktop/Last Names.txt");
		BufferedReader reader = new BufferedReader(file);
		
		String text = "";
		String line = reader.readLine();

	for(int i = 0; i < listOfLastNames.length; i++) {
		
		text = line;
		String[] s = text.split(" ");
		this.listOfLastNames[i] = s[0];
		line  = reader.readLine();
	  }
	
	    reader.close();
	}


	public Name[] getListOfAllFirstNames() throws Exception {
		setListOfAllFirstNames();
		return listOfAllFirstNames;
	}


	public void setListOfAllFirstNames() throws Exception {
		
		// TESTED //
	    int  i = 0;
	    int j = 0;
	    
	    setListOfBoysNames();
	    setListOfGirlsNames();
		
		while(i < listOfBoysNames.length) {
			listOfAllFirstNames[i] = listOfBoysNames[i].clone();
		i++;
		}
		
		while(j < listOfGirlsNames.length) {
			listOfAllFirstNames[i] = listOfGirlsNames[j].clone();
			i++;
			j++;
		}
		
	}
	
	
	public Name clone() {
		Name clone = new Name(firstName, lastName, gender);
		return clone;
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
