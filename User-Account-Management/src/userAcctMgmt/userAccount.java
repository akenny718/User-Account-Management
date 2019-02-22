package userAcctMgmt;

import java.text.DecimalFormat;
import java.util.concurrent.atomic.AtomicInteger;


public class userAccount {

	private String firstName;
	private String lastName;
	private static int ID = 10000000;
	private String iD;
	private String gender;
	private String userName;
	private String password;
	private double gpa;
	

	
	userAccount(Name name){
		this.firstName = name.getFirstName();
		this.lastName = name.getLastName();
		this.gender = name.getGender();
		this.ID++; //TESTED FOR ATOMIC INCREMENTS
		this.iD = Integer.toString(this.ID);
		this.userName = emitUserName(this.firstName, this.lastName, this.iD);
		this.password = emitPassword();
		this.gpa = emitGPA();

	}


    public userAccount() {

	}


	//EMITTERS
	public Name emitFirstName(Name[] listOfAllFirstNames){

		int max = listOfAllFirstNames.length;
        int randomNumber = (int) (Math.random() * max);
        return listOfAllFirstNames[randomNumber];

	}


	public String emitLastName(String[] listOfLastNames){

		int max = listOfLastNames.length;
        int randomNumber = (int) (Math.random() * max);
        return listOfLastNames[randomNumber];

	}


	public boolean isMale(Name firstName){
		if(firstName.getGender() == "B"){
			return true;
		}
		else
		return false;
	}


	public String emitID(){
		// TESTED //
		this.ID++; 
		this.iD = Integer.toString(this.ID);
		return this.iD;
	}


	public double emitGPA(){
      // TESTED //
	  double randomGPA = (Math.random() * 5.0);
	  DecimalFormat df = new DecimalFormat("#.##");
	  randomGPA = Double.parseDouble(df.format(randomGPA));

	  return randomGPA;
	}


	public String emitUserName(String firstName, String lastName, String iD){

		// TESTED //
		int j = 0;
		char [] lastNameCharArray = lastName.toCharArray();
		char [] firstNameCharArray = firstName.toCharArray();
		char [] iDCharArray = iD.toCharArray();


		if(lastNameCharArray.length < 4) {

			char [] userNameCharArray = new char[lastNameCharArray.length + 2];

			for(int i = 0; i < lastNameCharArray.length; i++) {

				userNameCharArray[i] = lastNameCharArray[i];
				j = i + 1;
			}

			userNameCharArray[j] = firstNameCharArray[0];
			j++;
			userNameCharArray[j] = iDCharArray[7];

			String userNameString = new String(userNameCharArray);

			return userNameString;

		}
		else {

			char [] userNameCharArray = new char[6];

			for(int i = 0; i < 4; i++){

				userNameCharArray[i] = lastNameCharArray[i];
				j = i + 1;
			}

			userNameCharArray[j] = firstNameCharArray[0];
			j++;
			userNameCharArray[j] = iDCharArray[7];

			String userNameString = new String(userNameCharArray);

			return userNameString;
		}

	}


	public String emitPassword(){
		return "0";
	}


	public void sortAccounts(){

	}


	public boolean searchAccount(String username, String password){
		return true;
	}


	public boolean searchAccount(String username){
		return true;
	}



	//GETTERS
	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public String getiD() {
		return iD;
	}


	public String getGender() {
		return gender;
	}


	public String getUserName() {
		return userName;
	}


	public String getPassword() {
		return password;
	}


	public double getGpa() {
		return gpa;
	}






}
