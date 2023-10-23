package project1.layers.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import project1.layers.models.ApprovalForm;
import project1.layers.models.Course;
import project1.layers.service.ApprovalFormService;

public class ApprovalFormController {

	public static Gson gson = new Gson();

	public static void reviewForm(HttpServletRequest request, HttpServletResponse response) throws IOException {
		List<ApprovalForm> getAllForms = ApprovalFormService.getAllUserInfo();
		response.getWriter().append(gson.toJson(getAllForms));

	}

//	public static void updateStatus(HttpServletRequest request, HttpServletResponse response)
//			throws JsonSyntaxException, JsonIOException, IOException {
//		ApprovalForm af = gson.fromJson(request.getReader(), ApprovalForm.class);
//		System.out.println("Comments: " + af.getStatus());
//		System.out.println("Form ID: " + af.getReimbursement_id());
//
//		ApprovalFormService.updateStatus(af.getStatus(), af.getReimbursement_id());
//
//		response.setStatus(200);
//	}
//	
//	public static void updateComments(HttpServletRequest request, HttpServletResponse response) throws JsonSyntaxException, JsonIOException, IOException {
//		ApprovalForm af = gson.fromJson(request.getReader(), ApprovalForm.class);
//		System.out.println("Form ID: " + af.getReimbursement_id());
//		System.out.println("Comments: " + af.getComments());
//		
//		ApprovalFormService.updateComments(af.getComments(), af.getReimbursement_id());
//		
//		response.setStatus(200);
//	}
	
	public static void updateStatusAndComments(HttpServletRequest request, HttpServletResponse response) throws JsonSyntaxException, JsonIOException, IOException {
		ApprovalForm af = gson.fromJson(request.getReader(), ApprovalForm.class);
		System.out.println("Form ID: " + af.getReimbursement_id());
		System.out.println("Comments: " + af.getComments());
		
		ApprovalFormService.updateStatusAndComments(af.getStatus(), af.getComments(), af.getReimbursement_id());
		
		response.setStatus(200);
	}
	
	public static void acceptForm(HttpServletRequest request, HttpServletResponse response) throws JsonSyntaxException, JsonIOException, IOException {
		ApprovalForm af = gson.fromJson(request.getReader(), ApprovalForm.class);
		System.out.println("Course ID: " + af.getCourse_id());
		ApprovalFormService.acceptForm(af.getCourse_id());
		
		response.setStatus(200);
	}
	
	public static void getAllPersonalInfo(HttpServletRequest request, HttpServletResponse response) throws IOException {
		List<ApprovalForm> getAllForms = ApprovalFormService.getAllPersonalInfo();
		response.getWriter().append(gson.toJson(getAllForms));

	}
	

}
