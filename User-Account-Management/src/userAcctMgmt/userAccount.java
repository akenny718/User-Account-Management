package userAcctMgmt;

public class userAccount {

	private String firstName;
	private String lastName;
	private String iD;
	private String gender;
	private String userName;
	private String password;
	private double gpa;

	//ID HAS NOT BEEN ADDED YET
	userAccount(String firstName, String lastName, String gender, String userName, String password, double gpa){
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.userName = userName;
		this.password = password;
		this.gpa = gpa;

	}


    //EMITTERS
	public String emitFirstName(){
		return "0";
	}


	public String emitLastName(){
		return "0";
	}


	public boolean isMale(String firstName){
		return true;
	}


	public String emitID(){
		return "0";
	}


	public double emitGPA(){
	  return 0.0;
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
