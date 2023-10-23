package project1.layers.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import project1.layers.models.ApprovalForm;
import project1.layers.models.EmployeeSingleton;
import project1.layers.util.JDBCConnection;

public class ApprovalFormDAOImpl implements ApprovalFormDAO {

	Connection conn = JDBCConnection.getConnection();

	@Override
	public List<ApprovalForm> getAllUserInfo() {
		try {
			String sql = "SELECT * FROM reimbursement INNER JOIN " + "employee_form ON reimbursement.course_id = "
					+ "employee_form.course_id INNER JOIN course ON "
					+ "course.course_id = employee_form.course_id ORDER BY " + "(employee_form.employee_form_id) DESC";

			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			List<ApprovalForm> information = new ArrayList<>();

			while (rs.next()) {
				information.add(new ApprovalForm(rs.getString("CREATION_DATE"), rs.getString("CURRENT_TIME"),
						rs.getInt("REIMBURSEMENT_ID"), rs.getString("FIRSTNAME"), rs.getString("LASTNAME"),
						rs.getString("LOCATION"), rs.getInt("COURSE_TYPE_ID"), rs.getString("GRADES"),
						rs.getInt("COURSE_COST"), rs.getString("DESCRIPTION"), rs.getString("JUSTIFICATION"),
						rs.getString("PASSING_GRADE"), rs.getString("STATUS"), rs.getString("COMMENTS"),
						rs.getInt("APPROVED"), rs.getInt("REIMBURSEMENT_AMOUNT"), rs.getInt("COURSE_ID")));
			}
			return information;

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

//	@Override
//	public boolean updateStatus(String status, int reimbursement_id) {
//		try {
//
//			String sql = "UPDATE reimbursement SET status = ? WHERE reimbursement_id = ?";
//			PreparedStatement ps = conn.prepareStatement(sql);
//			ps.setString(1, status);
//			ps.setInt(2, reimbursement_id);
//			ps.execute();
//			return true;
//		} catch (SQLException s) {
//			s.printStackTrace();
//		}
//		return false;
//	}
//
//	@Override
//	public boolean updateComments(String comments, int reimbursement_id) {
//		try {
//
//			String sql = "UPDATE reimbursement SET comments = ? WHERE reimbursement_id = ?";
//			PreparedStatement ps = conn.prepareStatement(sql);
//			ps.setString(1, comments);
//			ps.setInt(2, reimbursement_id);
//			ps.execute();
//			return true;
//		} catch (SQLException s) {
//			s.printStackTrace();
//		}
//		return false;
//	}

	@Override
	public boolean updateStatusAndComments(String status, String comments, int reimbursement_id) {
		try {

			String sql = "UPDATE reimbursement SET status = ?, comments = ? WHERE reimbursement_id = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);		
			ps.setString(1, status);
			ps.setString(2, comments);
			ps.setInt(3, reimbursement_id);
			ps.execute();
			return true;
		} catch (SQLException s) {
			s.printStackTrace();
		}
		return false;
	}
	
	
	public boolean acceptForm(int course_id) {
		try {

			String sql = "UPDATE course SET approved = 1  WHERE course_id = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);		
			ps.setInt(1, course_id);
	
			ps.execute();
			return true;
		} catch (SQLException s) {
			s.printStackTrace();
		}
		return false;
	}

	@Override
	public List<ApprovalForm> getAllPersonalInfo() {
		try {
			String sql = "SELECT * FROM reimbursement INNER JOIN " + "employee_form ON reimbursement.course_id = "
					+ "employee_form.course_id INNER JOIN course ON "
					+ "course.course_id = employee_form.course_id  WHERE employee_form.employee_id = ? ORDER BY " 
					+ "(employee_form.employee_form_id) DESC";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, EmployeeSingleton.getInstance().getEmployee_id());
			ResultSet rs = ps.executeQuery();

			List<ApprovalForm> information = new ArrayList<>();

			while (rs.next()) {
				information.add(new ApprovalForm(rs.getString("CREATION_DATE"), rs.getString("CURRENT_TIME"),
						rs.getInt("REIMBURSEMENT_ID"), rs.getString("FIRSTNAME"), rs.getString("LASTNAME"),
						rs.getString("LOCATION"), rs.getInt("COURSE_TYPE_ID"), rs.getString("GRADES"),
						rs.getInt("COURSE_COST"), rs.getString("DESCRIPTION"), rs.getString("JUSTIFICATION"),
						rs.getString("PASSING_GRADE"), rs.getString("STATUS"), rs.getString("COMMENTS"),
						rs.getInt("APPROVED"), rs.getInt("REIMBURSEMENT_AMOUNT")));
			}
			return information;

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

}
