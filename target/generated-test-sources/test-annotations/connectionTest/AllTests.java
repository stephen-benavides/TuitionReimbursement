package connectionTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import project1.layers.models.Course;
import project1.layers.models.Employee;
import project1.layers.models.EmployeeFormSubmit;
import project1.layers.service.ApprovalFormService;
import project1.layers.service.EmployeeFormService;

class AllTests {

	// Services
	// ApprovalFormService
	@Test
	void getAllUserInfo() {
		ApprovalFormService.getAllUserInfo();
		assertTrue(true);
	}

	@Test
	void updateStatusAndComments() {
		String status = "Test status";
		String comments = "Test comments";
		int reimbursement_id = 63;
		ApprovalFormService.updateStatusAndComments(status, comments, reimbursement_id);
		assertTrue(true);
	}
	
	@Test
	void acceptForm() {
		int course_cost = 740;
		ApprovalFormService.acceptForm(course_cost);
		assertTrue(true);
	}
	
	//****************************************
	//This One Requires the user_id at login 
	@Test
	void getAllPersonalInfo() {
		Employee ef = new Employee();
		ef.setEmployee_id(49);
		ApprovalFormService.getAllPersonalInfo();	
		assertTrue(true);
	}
	//****************************************
	
//	@Test
//	void addCourse() {
//		Course c = new Course(23, 5, 780, "59%", 0);
//		CourseService.addCourse(c);
//		assertTrue(true);
//	}
	
	
	


}
