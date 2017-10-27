package ca.ciccc.madp202.maisaya.InterviewerBackend.Entities;

import java.io.Serializable;

public class HistoryEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	String topic;
	String date;
	String score;
	
	public HistoryEntity() {	}
	
	public HistoryEntity(String topic, String date, String score) {
		this.topic = topic;
		this.date = date;
		this.score = score;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}
	
	
}
