package ca.ciccc.madp202.maisaya.InterviewerBackend.Models.ResponseModels;

import java.util.Calendar;

import javax.xml.bind.annotation.XmlRootElement;

import ca.ciccc.madp202.maisaya.InterviewerBackend.Entities.InterviewType;

@XmlRootElement
public class AnswerCollectionResponseModel {
	
	int interviewid;
	int questions;
	int correctAnswer;
	int worngAnswer;
	int skippedAnswer;
	InterviewType interviewType;
	int duration;
	int score;
	Calendar date;
	int level;

	public AnswerCollectionResponseModel() {}

	public AnswerCollectionResponseModel(int interviewid, int questions, int correctAnswer, int worngAnswer,
			int skippedAnswer, InterviewType interviewType, int duration, int score, Calendar date, int level) {
		this.interviewid = interviewid;
		this.questions = questions;
		this.correctAnswer = correctAnswer;
		this.worngAnswer = worngAnswer;
		this.skippedAnswer = skippedAnswer;
		this.interviewType = interviewType;
		this.duration = duration;
		this.score = score;
		this.date = date;
		this.level = level;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
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

	public int getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(int correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public int getWorngAnswer() {
		return worngAnswer;
	}

	public void setWorngAnswer(int worngAnswer) {
		this.worngAnswer = worngAnswer;
	}

	public int getSkippedAnswer() {
		return skippedAnswer;
	}

	public void setSkippedAnswer(int skippedAnswer) {
		this.skippedAnswer = skippedAnswer;
	}

	public InterviewType getInterviewType() {
		return interviewType;
	}

	public void setInterviewType(InterviewType interviewType) {
		this.interviewType = interviewType;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
