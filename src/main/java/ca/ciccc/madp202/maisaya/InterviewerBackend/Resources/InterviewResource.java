package ca.ciccc.madp202.maisaya.InterviewerBackend.Resources;

import java.util.ArrayList;
import java.util.Calendar;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ca.ciccc.madp202.maisaya.InterviewerBackend.InterviewService;
import ca.ciccc.madp202.maisaya.InterviewerBackend.Entities.HistoryEntity;
import ca.ciccc.madp202.maisaya.InterviewerBackend.Entities.InterviewType;
import ca.ciccc.madp202.maisaya.InterviewerBackend.Entities.User;
import ca.ciccc.madp202.maisaya.InterviewerBackend.Models.RequestModels.AnswerCollectionRequestModel;
import ca.ciccc.madp202.maisaya.InterviewerBackend.Models.RequestModels.CredentialRequestModel;
import ca.ciccc.madp202.maisaya.InterviewerBackend.Models.RequestModels.UserRequestModel;
import ca.ciccc.madp202.maisaya.InterviewerBackend.Models.ResponseModels.AnswerCollectionResponseModel;
import ca.ciccc.madp202.maisaya.InterviewerBackend.Models.ResponseModels.CredentialResponseModel;
import ca.ciccc.madp202.maisaya.InterviewerBackend.Models.ResponseModels.HistoryResponseModel;
import ca.ciccc.madp202.maisaya.InterviewerBackend.Models.ResponseModels.InterviewSelectionResponseModel;
import ca.ciccc.madp202.maisaya.InterviewerBackend.Models.ResponseModels.UserResponseModel;

@Path("interview")
public class InterviewResource {
	InterviewService is = new InterviewService();
	ArrayList<User> userList = new ArrayList<>();
	ArrayList<HistoryEntity> historyRecord = new ArrayList<>();

	
    @Path("/users")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public UserResponseModel createUserResponseModel(UserRequestModel urm) {
    		userList = is.deserializationFromUserFile();
	    User user = is.createUserForFile(urm, userList);
	    is.selializationToUserFile(user, userList);
		for(User user1: userList) {
			System.out.println(user.getUsername());
			System.out.println(user.getPassword());
		}
    		return new UserResponseModel(user.getFirstname(),user.getLastname(),user.getUserId(),user.getUsername(), user.getJoin(), user.getAuthToken(), user.getStatus());    	
    }
    
    @Path("/login")
    @POST
    @Produces(MediaType.APPLICATION_JSON)   
    public CredentialResponseModel createCredentialResponseModel(CredentialRequestModel crm) {
    		userList = is.deserializationFromUserFile();
    		System.out.println("userlistの長さは"+userList.size());
    		for(int i=0; i<userList.size(); i++) {
    			System.out.println("userlistのusername: "+userList.get(i).getUsername());
    			System.out.println("userlistのpassword: "+userList.get(i).getPassword());
    		}
		CredentialResponseModel urm2 = is.userCheck(crm, userList);
		
    		return urm2;    	
    }
    
    @Path("/topics/{topic}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)    
    public InterviewSelectionResponseModel createInterviewSelectionResponseModel(@PathParam("topic") InterviewType topic) {
    	System.out.println("aaa");
	  return is.passQuestions(topic);  	
    }

    @Path("/{interviewId}")
    @POST
    @Produces(MediaType.APPLICATION_JSON) 
    public AnswerCollectionResponseModel createAnswerCollectionResponseModel(@PathParam("interviewId") int interviewId, AnswerCollectionRequestModel acrm) {
	    AnswerCollectionResponseModel acrm2 = is.markInterview(acrm);
		ArrayList<HistoryEntity> historyRecord = is.deserializationFromResultsFile(acrm.getUserId());
		is.selializationToResultsFile(acrm.getUserId(), is.createHistoryEntity(acrm2), historyRecord);

		return acrm2;	
    }

    @Path("/history/user/{userId}")
    @GET
    @Produces(MediaType.APPLICATION_JSON) 
    public HistoryResponseModel createHistoryResponseModel(@PathParam("userId") int userId) {
    		ArrayList<HistoryEntity> historyRecord = is.deserializationFromResultsFile(userId);
    		
    		return new HistoryResponseModel(historyRecord);
    }
    
}
