package ca.ciccc.madp202.maisaya.InterviewerBackend.Models.RequestModels;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CredentialRequestModel {
	
	String username;
	String password;
	
	public CredentialRequestModel(String username, String password){
		this.username = username;
		this.password = password;
	}
	
	public CredentialRequestModel() {}
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
