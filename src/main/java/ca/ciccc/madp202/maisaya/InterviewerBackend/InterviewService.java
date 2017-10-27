package ca.ciccc.madp202.maisaya.InterviewerBackend;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

import ca.ciccc.madp202.maisaya.InterviewerBackend.Entities.AnswerSheet;
import ca.ciccc.madp202.maisaya.InterviewerBackend.Entities.HistoryEntity;
import ca.ciccc.madp202.maisaya.InterviewerBackend.Entities.InterviewType;
import ca.ciccc.madp202.maisaya.InterviewerBackend.Entities.Question;
import ca.ciccc.madp202.maisaya.InterviewerBackend.Entities.User;
import ca.ciccc.madp202.maisaya.InterviewerBackend.Models.RequestModels.AnswerCollectionRequestModel;
import ca.ciccc.madp202.maisaya.InterviewerBackend.Models.RequestModels.CredentialRequestModel;
import ca.ciccc.madp202.maisaya.InterviewerBackend.Models.RequestModels.UserRequestModel;
import ca.ciccc.madp202.maisaya.InterviewerBackend.Models.ResponseModels.AnswerCollectionResponseModel;
import ca.ciccc.madp202.maisaya.InterviewerBackend.Models.ResponseModels.CredentialResponseModel;
import ca.ciccc.madp202.maisaya.InterviewerBackend.Models.ResponseModels.InterviewSelectionResponseModel;

public class InterviewService {


/* Registration */	
	public User createUserForFile(UserRequestModel urm, ArrayList<User> userList) {
		int userId = userList.size()+1;
		Calendar today = Calendar.getInstance();
		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd, MMMM yyyy");
		String join = dateFormatter.format(today.getTime());
		String authToken = UUID.randomUUID().toString().toUpperCase();
		User user = new User(urm.getFirstname(),urm.getLastname(),urm.getUsername(), urm.getCountry(), urm.getPassword(), 200, userId, join, authToken);
		return user;
	}
	
	
/* Login */
	public CredentialResponseModel userCheck(CredentialRequestModel crm, ArrayList<User> userList) {
		for(int i = 0; i<userList.size(); i++) {
			if(crm.getUsername().equals(userList.get(i).getUsername())) {
				if(crm.getPassword().equals(userList.get(i).getPassword())) {
					return new CredentialResponseModel(userList.get(i).getFirstname(),userList.get(i).getLastname(), userList.get(i).getUserId(),userList.get(i).getUsername(),userList.get(i).getJoin(), userList.get(i).getStatus(), userList.get(i).getAuthToken());
				}
				else {
					return new CredentialResponseModel(null,null,0,userList.get(i).getUsername(),null, 0, null);
				}
			}
		}
		return null;
	}
	
	public void selializationToUserFile(User user, ArrayList<User> userList) {
		userList.add(user);
       try{
    	     // serialize data object to a file
         FileOutputStream fos= new FileOutputStream("UsersFile");
         ObjectOutputStream oos= new ObjectOutputStream(fos);
         oos.writeObject(userList);
         oos.close();
         fos.close();
//         File f = new File(".");
//         System.out.println(f.getAbsolutePath());
         
         
       }catch(IOException ioe){
            ioe.printStackTrace();
        }
		
	}
	
	public ArrayList<User> deserializationFromUserFile() {
		ArrayList<User> userList = new ArrayList<>();
	    
		try{
	        FileInputStream fis = new FileInputStream("UsersFile1");
	        ObjectInputStream ois = new ObjectInputStream(fis);
	        userList = (ArrayList) ois.readObject();
	        ois.close();
	        fis.close();
	        return userList;
	      }catch(IOException ioe){
	         ioe.printStackTrace();
	      }catch(ClassNotFoundException c){
	         System.out.println("Class not found");
	         c.printStackTrace();
	      }
        return userList;
	}
	
	
/* Interview */	
	public InterviewSelectionResponseModel passQuestions(InterviewType topic) {
		
		Question[] javaQuestions = new Question[]{new Question("javaQuestions! Answer is A", "item1", "item2", "item3", "item4", 2, 1),
				new Question("Answer is B", "item1", "item2", "item3", "item4", 2, 2),
				new Question("Answer is C", "item1", "item2", "item3", "item4", 2, 3),
				new Question("Answer is D", "item1", "item2", "item3", "item4", 2, 4),
				new Question("Answer is A", "item1", "item2", "item3", "item4", 2, 5),
				new Question("Answer is B", "item1", "item2", "item3", "item4", 2, 6),
				new Question("Answer is C", "item1", "item2", "item3", "item4", 2, 7),
				new Question("Answer is D", "item1", "item2", "item3", "item4", 2, 8),
				new Question("Answer is A", "item1", "item2", "item3", "item4", 2, 9),
				new Question("Answer is B", "item1", "item2", "item3", "item4", 2, 10),
				new Question("Answer is C", "item1", "item2", "item3", "item4", 2, 11),
				new Question("Answer is D", "item1", "item2", "item3", "item4", 2, 12),
				new Question("Answer is A", "item1", "item2", "item3", "item4", 2, 13),
				new Question("Answer is B", "item1", "item2", "item3", "item4", 2, 14),
				new Question("Answer is C", "item1", "item2", "item3", "item4", 2, 15),
				new Question("Answer is D", "item1", "item2", "item3", "item4", 2, 16),
				new Question("Answer is A", "item1", "item2", "item3", "item4", 2, 17),
				new Question("Answer is B", "item1", "item2", "item3", "item4", 2, 18),
				new Question("Answer is C", "item1", "item2", "item3", "item4", 2, 19),
				new Question("Answer is D", "item1", "item2", "item3", "item4", 2, 20)};
		
		Question[] sqlQuestions = new Question[]{new Question("sqlQuestions! Answer is A", "item1", "item2", "item3", "item4", 2, 1),
				new Question("Answer is B", "item1", "item2", "item3", "item4", 2, 2),
				new Question("Answer is C", "item1", "item2", "item3", "item4", 2, 3),
				new Question("Answer is D", "item1", "item2", "item3", "item4", 2, 4),
				new Question("Answer is A", "item1", "item2", "item3", "item4", 2, 5),
				new Question("Answer is B", "item1", "item2", "item3", "item4", 2, 6),
				new Question("Answer is C", "item1", "item2", "item3", "item4", 2, 7),
				new Question("Answer is D", "item1", "item2", "item3", "item4", 2, 8),
				new Question("Answer is A", "item1", "item2", "item3", "item4", 2, 9),
				new Question("Answer is B", "item1", "item2", "item3", "item4", 2, 10),
				new Question("Answer is C", "item1", "item2", "item3", "item4", 2, 11),
				new Question("Answer is D", "item1", "item2", "item3", "item4", 2, 12),
				new Question("Answer is A", "item1", "item2", "item3", "item4", 2, 13),
				new Question("Answer is B", "item1", "item2", "item3", "item4", 2, 14),
				new Question("Answer is C", "item1", "item2", "item3", "item4", 2, 15),
				new Question("Answer is D", "item1", "item2", "item3", "item4", 2, 16),
				new Question("Answer is A", "item1", "item2", "item3", "item4", 2, 17),
				new Question("Answer is B", "item1", "item2", "item3", "item4", 2, 18),
				new Question("Answer is C", "item1", "item2", "item3", "item4", 2, 19),
				new Question("Answer is D", "item1", "item2", "item3", "item4", 2, 20)};
		
		InterviewSelectionResponseModel isrmJAVA = new InterviewSelectionResponseModel(1, 20, "java", 20, javaQuestions);
		InterviewSelectionResponseModel isrmSQL = new InterviewSelectionResponseModel(1, 20, "sql", 20, sqlQuestions);
		
		if(topic==InterviewType.JAVA) {
			return isrmJAVA;
		}
		else{
			return isrmSQL;
		}

	}
	
	final String[] java1Answers = {"A","B","C","D","A","B","C","D","A","B","C","D","A","B","C","D","A","B","C","D"};
	final String[] sql1Answers = {"A","B","C","D","A","B","C","D","A","B","C","D","A","B","C","D","A","B","C","D"};
	
	public AnswerCollectionResponseModel markInterview(AnswerCollectionRequestModel acrm) {
		int correctAnswer = 0;
		int wrongAnswer = 0;
		int skippedAnswer = 0;
		int score = 0;
		
		AnswerSheet as = null;
		if(acrm.getTopic()==InterviewType.JAVA) {
			as = new AnswerSheet(java1Answers, 1);
		}
		else if(acrm.getTopic()==InterviewType.SQL) {
			as = new AnswerSheet(sql1Answers, 1);
		}
		for(int i = 0; i < acrm.getAnswers().size(); i++) {
			if(acrm.getAnswers().get(i).getResponse().equals(as.getAnswerList()[i])) { //correct
				correctAnswer++;
			}
			else if(acrm.getAnswers().get(i).getResponse().equals("S")){ //skipped
				skippedAnswer++;
			}
			else { //wrong
				wrongAnswer++;
			}
		}
		score = correctAnswer*5;
		
	//for android project
		if(acrm.getDate()==null) {
			Calendar date = Calendar.getInstance();
		}	
		
		AnswerCollectionResponseModel acrm2 = new AnswerCollectionResponseModel(acrm.getInterviewId(), 20, correctAnswer, wrongAnswer, skippedAnswer, acrm.getTopic(), 20, score, acrm.getDate(), 1);
		return acrm2;
	}
	
	public void selializationToResultsFile(int userId, HistoryEntity historyEntity, ArrayList<HistoryEntity> historyRecord) {
		   historyRecord.add(historyEntity);
	       try{
	    	     // serialize data object to a file
	         FileOutputStream fos= new FileOutputStream("ResultsFile"+userId);
	         ObjectOutputStream oos= new ObjectOutputStream(fos);
	         oos.writeObject(historyRecord);
	         oos.close();
	         fos.close();
	         
	       	}catch(IOException ioe){
	            ioe.printStackTrace();
	        }
			
	}

	
/* History */
	public HistoryEntity createHistoryEntity(AnswerCollectionResponseModel acrm) {
		String topic = "";
		System.out.println(acrm.getInterviewType());
		if(acrm.getInterviewType()==InterviewType.JAVA) {
			topic = "Java";
		}
		else if(acrm.getInterviewType()==InterviewType.SQL) {
			topic = "SQL";
		}
		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd, MMMM yyyy");
		String date = dateFormatter.format(acrm.getDate().getTime());
		
		
//		Calendar date = Calendar.getInstance().getTime();
////      long resultDate = acrm.getDate().getTime();
//      SimpleDateFormat dateFormatter = new SimpleDateFormat("h:mm a - dd MMMM yyyy");
//      String formattedDate = dateFormatter.format(date);
////		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd, MMMM yyyy");
//		String dateS = dateFormatter.format(acrm.getDate().getTime());
		
		
		
		
		String score = acrm.getScore()+"/100";
		return new HistoryEntity(topic, date, score);
	}
	

	
	public ArrayList<HistoryEntity> deserializationFromResultsFile(int userId) {
		ArrayList<HistoryEntity> historyRecord = new ArrayList<>();
	    
		try{
	        FileInputStream fis = new FileInputStream("ResultsFile"+userId);
	        ObjectInputStream ois = new ObjectInputStream(fis);
	        historyRecord = (ArrayList) ois.readObject();
	        ois.close();
	        fis.close();
	        return historyRecord;
	      }catch(IOException ioe){
	         ioe.printStackTrace();
	      }catch(ClassNotFoundException c){
	         System.out.println("Class not found");
	         c.printStackTrace();
	      }
        return historyRecord;
	}

}
