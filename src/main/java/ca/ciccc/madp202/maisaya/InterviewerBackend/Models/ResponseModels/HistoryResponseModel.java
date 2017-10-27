package ca.ciccc.madp202.maisaya.InterviewerBackend.Models.ResponseModels;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

import ca.ciccc.madp202.maisaya.InterviewerBackend.Entities.HistoryEntity;

@XmlRootElement
public class HistoryResponseModel {
	ArrayList<HistoryEntity> historyRecord;
	
	public HistoryResponseModel() {}
	
	public HistoryResponseModel(ArrayList<HistoryEntity> historyRecord) {
		this.historyRecord = historyRecord;
	}

	public ArrayList<HistoryEntity> getHistoryRecord() {
		return historyRecord;
	}

	public void setHistoryRecord(ArrayList<HistoryEntity> historyRecord) {
		this.historyRecord = historyRecord;
	}
	
}
