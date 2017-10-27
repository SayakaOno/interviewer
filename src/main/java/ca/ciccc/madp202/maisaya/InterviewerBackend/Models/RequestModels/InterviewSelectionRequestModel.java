package ca.ciccc.madp202.maisaya.InterviewerBackend.Models.RequestModels;

import javax.xml.bind.annotation.XmlRootElement;

import ca.ciccc.madp202.maisaya.InterviewerBackend.Entities.InterviewType;


@XmlRootElement
public class InterviewSelectionRequestModel {
	InterviewType topic;
		
	public InterviewSelectionRequestModel() {}

	public InterviewSelectionRequestModel(InterviewType topic){
		this.topic = topic;
	}

	public InterviewType getType() {
		return topic;
	}

	public void setType(InterviewType topic) {
		this.topic = topic;
	}
	
	
}