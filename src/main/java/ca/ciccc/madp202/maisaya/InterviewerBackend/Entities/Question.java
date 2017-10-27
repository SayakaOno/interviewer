package ca.ciccc.madp202.maisaya.InterviewerBackend.Entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Question {
	String description;
	String item1;
	String item2;
	String item3;
	String item4;
	int difficultyLevel;	
	int questionid;
	
	public Question() {}
	
	public Question(String description, String item1, String item2, String item3, String item4, int difficultyLevel, int questionid) {
		this.description = description;
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
		this.difficultyLevel = difficultyLevel;
		this.questionid = questionid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getitem1() {
		return item1;
	}

	public void setitem1(String item1) {
		this.item1 = item1;
	}

	public String getitem2() {
		return item2;
	}

	public void setitem2(String item2) {
		this.item2 = item2;
	}

	public String getitem3() {
		return item3;
	}

	public void setitem3(String item3) {
		this.item3 = item3;
	}

	public String getitem4() {
		return item4;
	}

	public void setitem4(String item4) {
		this.item4 = item4;
	}

	public int getDifficultyLevel() {
		return difficultyLevel;
	}

	public void setDifficultyLevel(int difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}

	public int getQuestionId() {
		return questionid;
	}

	public void setQuestionId(int questionid) {
		this.questionid = questionid;
	}

}
