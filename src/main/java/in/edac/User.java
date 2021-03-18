package in.edac;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int user_id;
	private String firstName;
	private String lastName;
	private String userName;
	private long mobileNo;
	private String address;
	private String emailId;
	private String password;
	private String conformpassword;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String firstName, String lastName, String userName, long mobileNo,String address, String emailId, String password,String conformpassword,long aadharCard) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.mobileNo = mobileNo;
		this.address = address;
		this.emailId = emailId;
		this.password = password;
		this.conformpassword=conformpassword;

	}
	
	
	
	//Getters and Setters
	public int getId() {
		return user_id;
	}
	public void setId(int user_id) {
		this.user_id = user_id;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getConformpassword() {
		return conformpassword;
	}
	public void setConformpassword(String conformpassword) {
		this.conformpassword = conformpassword;
	}
	
}
