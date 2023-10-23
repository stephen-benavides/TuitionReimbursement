package project1.layers.dao;

import java.util.List;

import project1.layers.models.ApprovalForm;

public interface ApprovalFormDAO {

	//Get User Information
	public List<ApprovalForm> getAllUserInfo();
	
//	//Update User Status
//	public boolean updateStatus(String status, int reimbursement_id);
//	
//	//Update user approval
//	public boolean updateComments(String comments, int reimbursement_id);
	
	//Update Status and Comments
	public boolean updateStatusAndComments(String status, String comments, int reimbursement_id);
	
	//Update the acceptance of the form
	public boolean acceptForm(int course_id);
	
	public List <ApprovalForm> getAllPersonalInfo();
	

}
