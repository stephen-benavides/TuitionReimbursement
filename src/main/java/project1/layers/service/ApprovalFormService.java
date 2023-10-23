package project1.layers.service;

import java.util.List;

import project1.layers.dao.ApprovalFormDAO;
import project1.layers.dao.ApprovalFormDAOImpl;
import project1.layers.models.ApprovalForm;

public class ApprovalFormService {

	static ApprovalFormDAO ad = new ApprovalFormDAOImpl();
	
	public static List<ApprovalForm> getAllUserInfo(){
		return ad.getAllUserInfo();
	}
	
//	public static boolean updateStatus(String status, int reimbursement_id) {
//		return ad.updateStatus(status, reimbursement_id);
//	}
//	
//	public static boolean updateComments(String comments, int reimbursement_id) {
//		return ad.updateComments(comments, reimbursement_id);
//	}
	
	public static boolean updateStatusAndComments(String status, String comments, int reimbursement_id) {
		return ad.updateStatusAndComments(status, comments, reimbursement_id);
	}
	
	public static boolean acceptForm(int course_id) {
		return ad.acceptForm(course_id);
	}
	
	public static List<ApprovalForm> getAllPersonalInfo(){
		return ad.getAllPersonalInfo();
	}
}
