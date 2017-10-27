package ca.ciccc.madp202.maisaya.InterviewerBackend.Entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AnswerEntity {
	int questionId;
	String response;
	
	public AnswerEntity() {}
	
	public AnswerEntity(int questionId, String response) {
		this.questionId = questionId;
		this.response = response;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	

}
