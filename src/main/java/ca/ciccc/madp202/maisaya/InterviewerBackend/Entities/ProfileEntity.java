package ca.ciccc.madp202.maisaya.InterviewerBackend.Entities;

public class ProfileEntity {
	
    private String firstname;
    private String lastname;
    private String userId;
    private String username;
    private String joined;
	int status;
    
	public ProfileEntity(String firstname, String lastname, String userId, String username, String joined, int status) {

		this.firstname = firstname;
		this.lastname = lastname;
		this.userId = userId;
		this.username = username;
		this.joined = joined;
		this.status = status;
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
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
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
	
}
