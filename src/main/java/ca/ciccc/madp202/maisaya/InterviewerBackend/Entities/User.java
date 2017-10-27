package ca.ciccc.madp202.maisaya.InterviewerBackend.Entities;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	String firstname;
	String lastname;
	String username;
	String country;
	String password;
	int status;
	int userId;
	String join;
	String authToken;

	public User(String firstname, String lastname, String username, String country, String password, int status, int userId, String join, String authToken) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.country = country;
		this.password = password;
		this.status = status;
		this.userId = userId;
		this.join = join;
		this.authToken = authToken;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getJoin() {
		return join;
	}

	public void setJoin(String join) {
		this.join = join;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

}
