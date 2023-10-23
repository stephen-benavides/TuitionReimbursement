package project1.layers.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import project1.layers.models.Employee;
import project1.layers.models.EmployeeSingleton;
import project1.layers.util.JDBCConnection;

public class EmployeeDAOImpl implements EmployeeDAO {
	Connection conn = JDBCConnection.getConnection();

	@Override
	public boolean addEmployee(Employee e) {
		try {

			String sql = "CALL add_employee_TRMS (?,?,?,?)";
			CallableStatement cs = conn.prepareCall(sql);

			cs.setString(1, e.getFirstname());
			cs.setString(2, e.getLastname());
			cs.setString(3, e.getUsername());
			cs.setString(4, e.getPassword()); 

			cs.execute();

		} catch (SQLException s) { 
			s.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean logging(String username, String password) {
		try {

			String sql = "SELECT role_id, employee_id from employee WHERE username = ? AND password = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
		
			if(rs.next()) {
				EmployeeSingleton.setRole_id(rs.getInt("ROLE_ID")); 
				EmployeeSingleton.setEmployee_id(rs.getInt("EMPLOYEE_ID")); 
			
				return true;
			}

		} catch (SQLException s) {
			s.printStackTrace();
		}
		
		return false;
	}


}
