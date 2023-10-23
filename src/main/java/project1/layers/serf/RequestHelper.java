package project1.layers.serf;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project1.layers.controller.ApprovalFormController;
import project1.layers.controller.EmployeeController;
import project1.layers.controller.EmployeeFormController;

public class RequestHelper {

	public static void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		/*
		 * This method will delegate other methods on the controller layer of the
		 * application to process the request - This is my delegator
		 */

		String uri = request.getRequestURI();
		System.out.println(uri);

		switch (uri) {
		
		
		case "/TRMS/userregistration.do": {
			EmployeeController.addEmployee(request, response);
			break;
		}
		case "/TRMS/logging.do": {
			EmployeeController.userLogging(request, response);
			break;
		}
		
		case "/TRMS/userLogout.do":{
			EmployeeController.userLogout(request, response);
			break;
		}
		
		case "/TRMS/addForm.do":{
			EmployeeFormController.addForm(request, response);
			break;
		}
		
		case "/TRMS/reviewForm.do":{
			ApprovalFormController.reviewForm(request, response);
			break;
		}
//		case "/TRMS/updateFormStatus.do" :{
//			ApprovalFormController.updateStatus(request, response);
//			break;
//		}
//		case "/TRMS/updateFormComments.do":{
//			ApprovalFormController.updateComments(request, response);
//			break;
//		}
		
		case "/TRMS/updateFormStatus.do":{
			ApprovalFormController.updateStatusAndComments(request, response);
			break;
		}
		
		case "/TRMS/acceptForm.do":{
			ApprovalFormController.acceptForm(request, response);
			break;
		}
		
		case "/TRMS/getAllPersonalInfo.do":{
			ApprovalFormController.getAllPersonalInfo(request, response);
			break;
		}
		
		default:{
			response.sendError(418, "I am a teapot");
		}
		
		}
	}
}
