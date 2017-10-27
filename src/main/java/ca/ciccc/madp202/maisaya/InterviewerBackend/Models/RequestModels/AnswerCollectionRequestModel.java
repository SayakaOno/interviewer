package ca.ciccc.madp202.maisaya.InterviewerBackend.Models.RequestModels;

import java.util.ArrayList;
import java.util.Calendar;

import javax.xml.bind.annotation.XmlRootElement;

import ca.ciccc.madp202.maisaya.InterviewerBackend.Entities.AnswerEntity;
import ca.ciccc.madp202.maisaya.InterviewerBackend.Entities.InterviewType;

@XmlRootElement
public class AnswerCollectionRequestModel {

	ArrayList<AnswerEntity> answers;
	int interviewId;
	int userId;
	Calendar date;
	InterviewType topic;

	public AnswerCollectionRequestModel() {}


	public AnswerCollectionRequestModel(ArrayList<AnswerEntity> answers, int interviewId, int userId, Calendar date, InterviewType topic) {
		this.answers = answers;
		this.interviewId = interviewId;
		this.userId = userId;
		this.date = date;
		this.topic = topic;
	}


	public InterviewType getTopic() {
		return topic;
	}


	public void setTopic(InterviewType topic) {
		this.topic = topic;
	}


	public ArrayList<AnswerEntity> getAnswers() {
		return answers;
	}


	public void setAnswers(ArrayList<AnswerEntity> answers) {
		this.answers = answers;
	}


	public int getInterviewId() {
		return interviewId;
	}


	public void setInterviewId(int interviewId) {
		this.interviewId = interviewId;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public Calendar getDate() {
		return date;
	}


	public void setDate(Calendar date) {
		this.date = date;
	}

}
