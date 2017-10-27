package ca.ciccc.madp202.maisaya.InterviewerBackend.Entities;

import java.util.ArrayList;

public class HistoryCollectionEntity {
	ArrayList<HistoryEntity> historyRecord;
	
	public HistoryCollectionEntity(ArrayList<HistoryEntity> historyRecord) {
		this.historyRecord = historyRecord;
	}
	
	public HistoryCollectionEntity() {}

	public ArrayList<HistoryEntity> getHistoryRecord() {
		return historyRecord;
	}

	public void setHistoryRecord(ArrayList<HistoryEntity> historyRecord) {
		this.historyRecord = historyRecord;
	}
	
}
