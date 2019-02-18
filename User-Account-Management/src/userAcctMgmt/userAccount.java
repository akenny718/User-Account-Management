package userAcctMgmt;

import java.text.DecimalFormat;

public class userAccount {

	private String firstName;
	private String lastName;
	private String iD;
	private String gender;
	private String userName;
	private String password;
	private double gpa;

	//ID HAS NOT BEEN ADDED YET
	userAccount(Name firstName, String lastName, String gender, String userName, String password, double gpa){
		this.firstName = firstName.getFirstName();
		this.lastName = lastName;
		this.gender = gender;
		this.userName = userName;
		this.password = password;
		this.gpa = gpa;

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
		return "0";
	}


	public double emitGPA(){
      // TESTED //
	  double randomGPA = (Math.random() * 5.0);
	  DecimalFormat df = new DecimalFormat("#.##");
	  randomGPA = Double.parseDouble(df.format(randomGPA));

	  return randomGPA;
	}


	public String emitUserName(){
		return "0";
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
