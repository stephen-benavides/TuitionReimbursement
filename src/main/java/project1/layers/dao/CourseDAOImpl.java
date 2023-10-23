package project1.layers.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import project1.layers.models.Course;
import project1.layers.util.JDBCConnection;

public class CourseDAOImpl implements CourseDAO {
	
	Connection conn = JDBCConnection.getConnection();

	@Override
	public int addCourse(Course c) { 
		try {
			
			
			
			String sql = "CALL add_course_TRMS (?, ?, ?, ?, ? , ?)";
			
			CallableStatement cs = conn.prepareCall(sql);
			cs.setInt(1, c.getCourse_type_id());
			cs.setInt(2, c.getCourse_cost());
			cs.setInt(3, c.getGrades_id());
			cs.setString(4, c.getPassing_grade());
			cs.setInt(5, c.getApproved());
			//Get the current iteration of the id
			cs.registerOutParameter(6, java.sql.Types.INTEGER);
			
			cs.executeQuery();

			c.setCourse_id(cs.getInt(6));
			System.out.println(c);
			
			System.out.println("New course_id: " + c.getCourse_id());
			
			return c.getCourse_id();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
