package project1.layers.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import project1.layers.models.Course;
import project1.layers.models.Employee;
import project1.layers.models.EmployeeFormSubmit;
import project1.layers.models.EmployeeSingleton;
import project1.layers.models.Reimbursement;
import project1.layers.service.CourseService;
import project1.layers.service.EmployeeService;
import project1.layers.service.ReimbursementService;
import project1.layers.util.JDBCConnection;

public class EmployeeFormDAOImpl implements EmployeeFormDAO {

	Connection conn = JDBCConnection.getConnection();

	@Override
	public void addForm(EmployeeFormSubmit e) {

		try { 
			// The elements that we are adding into the reimbursement are taken from the EmployeeFormSubmit
			String sql = "CALL add_employee_form_TRMS (?,?,?,?,?,?,?,?,?,?,?,?)";

			CallableStatement cs = conn.prepareCall(sql);
			
			int grades_id;
			String passing_grade;
			int approved = 0; 
			
			//Obtaining time
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd"); 
			DateFormat timeFormat = new SimpleDateFormat("HH:mm");
			//Time in milliseconds
			Date now = new Date(System.currentTimeMillis());
			//java.sql.Date date = new java.sql.Date(0000-00-00);
			String dateString = dateFormat.format(now);
			String timeString = timeFormat.format(now);
			
			int course_type_id = e.getCourse_type_id();
			float percentage;
			
			switch(course_type_id) {
			case 1 : {
				percentage = 0.8f;
				break;
			}
			case 2: { 
				percentage = 0.6f;
				break;
			}
			case 3: {
				percentage = 0.75f;
				break;
			}
			case 4:{
				percentage = 1f;
				break;
			}
			case 5: {
				percentage = 0.9f;
				break;
				
			}
			case 6: {
				percentage = 0.3f;
				break;
			}
			
			default:
				percentage = 0f;
				break;
			}
			
			
			if (e.getGrade().contains("%")) {
			 
				grades_id = 2;
				passing_grade = "60%";
			}else {
				grades_id = 1;
				passing_grade = "C";
			}
			
			
			Course c = new Course(e.getCourse_type_id(), e.getCost(), grades_id, passing_grade, approved);
			int course_id = CourseService.addCourse(c);
			System.out.println("Course ID: " + course_id);
			
			float reimbursement_amount = e.getCost()*percentage;
	
			System.out.println(reimbursement_amount);
			Reimbursement r = new Reimbursement(EmployeeSingleton.getInstance().getEmployee_id(), course_id,"Pending",reimbursement_amount,"");
			System.out.println("Reimbursement Percentage: " + percentage);
			System.out.println("e.getCost(): " + e.getCost());
			int a = ReimbursementService.addReimbursement(r);
			System.out.println("Add Reimbursement: " + a);
			
			cs.setInt(1, course_id);
			cs.setInt(2, e.getCourse_type_id());
			cs.setInt(3, EmployeeSingleton.getInstance().getEmployee_id());
//			cs.setString(4, date.toString());
			cs.setString(4, dateString);
			cs.setString(5, timeString);
//			cs.setString(4, System.currentTimeMillis() + "");
//			cs.setString(5, time.toString());
			cs.setInt(6, a);
			cs.setString(7, e.getFirstname());
			cs.setString(8,  e.getLastname());
			cs.setString(9, e.getLocation());
			cs.setString(10, e.getDescription());
			cs.setString(11, e.getJustification());
			cs.setString(12, e.getGrade());
			
			System.out.println(dateString);
			System.out.println(timeString);
			
			
			System.out.println(e);
			
			cs.execute();

		} catch (SQLException s) {
			s.printStackTrace();
		}

	}

}
