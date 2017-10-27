package ca.ciccc.madp202.maisaya.InterviewerBackend.Models.ResponseModels;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CredentialResponseModel {
	
    private String firstname;
    private String lastname;
    private int userId;
    private String username;
    private String joined;
    private int status;
    private String authToken;
	
	public CredentialResponseModel() {}

	public CredentialResponseModel(String firstname, String lastname, int userId, String username, String joined, int status, String authToken) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.userId = userId;
		this.username = username;
		this.joined = joined;
		this.status = status;
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

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getJoined() {
		return joined;
	}

	public void setJoined(String joined) {
		this.joined = joined;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	
	
}
