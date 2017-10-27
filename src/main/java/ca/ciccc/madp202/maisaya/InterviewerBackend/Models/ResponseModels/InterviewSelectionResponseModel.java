package ca.ciccc.madp202.maisaya.InterviewerBackend.Models.ResponseModels;

import javax.xml.bind.annotation.XmlRootElement;

import ca.ciccc.madp202.maisaya.InterviewerBackend.Entities.Question;

@XmlRootElement
public class InterviewSelectionResponseModel {
	int interviewid;
	int questions;
	String topic;
	int duration;
	Question[] interviewquestions;
	
	public InterviewSelectionResponseModel() {}


	public InterviewSelectionResponseModel(int interviewid, int questions, String topic, int duration, Question[] interviewquestions) {

		this.interviewid = interviewid;
		this.questions = questions;
		this.topic = topic;
		this.duration = duration;
		this.interviewquestions = interviewquestions;
	}

	public int getInterviewid() {
		return interviewid;
	}

	public void setInterviewid(int interviewid) {
		this.interviewid = interviewid;
	}

	public int getQuestions() {
		return questions;
	}

	public void setQuestions(int questions) {
		this.questions = questions;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Question[] getInterviewquestions() {
		return interviewquestions;
	}

	public void setInterviewquestions(Question[] interviewquestions) {
		this.interviewquestions = interviewquestions;
	}



}
