package ca.ciccc.madp202.maisaya.InterviewerBackend.Entities;

public class AnswerSheet {
	
	String[] answerList;
	int interviewId;

	public AnswerSheet(String[] answerList, int interviewId) {
		this.answerList = answerList;
		this.interviewId = interviewId;
	}

	public String[] getAnswerList() {
		return answerList;
	}

	public void setAnswerList(String[] answerList) {
		this.answerList = answerList;
	}

	public int getInterviewId() {
		return interviewId;
	}

	public void setInterviewId(int interviewId) {
		this.interviewId = interviewId;
	}
	

}
