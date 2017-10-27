package ca.ciccc.madp202.maisaya.InterviewerBackend.Entities;

public class UserEntity {
	private String username;
	private String firstName;
	private String lastName;
	private String country;
	private String password;

   
	public UserEntity(String username, String firstName, String lastName, String country, String password) {
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
		this.password = password;
	}



	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
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
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}


}
