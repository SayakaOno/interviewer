package ca.ciccc.madp202.maisaya.InterviewerBackend.Entities;

import java.util.Iterator;

import javax.xml.bind.annotation.XmlRootElement;

import ca.ciccc.madp202.maisaya.InterviewerBackend.Entities.Question;

@XmlRootElement
public class InterviewEntity implements Iterable<Question> {
	int Interviewid;
	int questions;
	InterviewType topic;
	int duration;
	Question[] interviewquestions;
	
	public InterviewEntity() {}

	public InterviewEntity(int interviewid, int questions, InterviewType topic, int duration,
			Question[] interviewquestions) {

		Interviewid = interviewid;
		this.questions = questions;
		this.topic = topic;
		this.duration = duration;
		this.interviewquestions = interviewquestions;
	}

	public int getInterviewid() {
		return Interviewid;
	}



	public void setInterviewid(int interviewid) {
		Interviewid = interviewid;
	}



	public int getQuestions() {
		return questions;
	}



	public void setQuestions(int questions) {
		this.questions = questions;
	}



	public InterviewType getTopic() {
		return topic;
	}



	public void setTopic(InterviewType topic) {
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



	@Override
	public Iterator<Question> iterator() {
		return new QuestionIterator(interviewquestions);
	}
	
}
