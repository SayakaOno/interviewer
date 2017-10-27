package ca.ciccc.madp202.maisaya.InterviewerBackend.Models.RequestModels;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserRequestModel{
	String firstname;
	String lastname;
	String username;
	String country;
	String password;
	
	public UserRequestModel() {}
	
	public UserRequestModel(String firstname, String lastname, String username, String country, String password){
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.country = country;
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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
