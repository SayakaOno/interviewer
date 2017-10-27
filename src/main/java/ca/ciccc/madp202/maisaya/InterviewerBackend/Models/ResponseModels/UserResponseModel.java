package ca.ciccc.madp202.maisaya.InterviewerBackend.Models.ResponseModels;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserResponseModel{
	
    private String firstname;
    private String lastname;
    private int userId;
    private String username;
    private String joined;
    private String authToken;
    private int status;

    public UserResponseModel() {}

    public UserResponseModel(String firstname, String lastname, int userId, String username, String joined, String authToken, int status) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.userId = userId;
        this.username = username;
        this.joined = joined;
        this.authToken = authToken;
		this.status = status;
    }
    
    
	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}


    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getJoined() {
        return joined;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }
  
    public void setJoined(String joined) {
        this.joined = joined;
    }

	
}