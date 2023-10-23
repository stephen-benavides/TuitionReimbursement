package project1.layers.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import project1.layers.models.Reimbursement;
import project1.layers.util.JDBCConnection;

public class ReimbursementDAOImpl implements ReimbursementDAO {

	Connection conn = JDBCConnection.getConnection();

	@Override
	public int addReimbursement(Reimbursement r) {

		try {

			String sql = "call add_reimbursement_TRMS(?,?,?,?,?)";
			CallableStatement cs = conn.prepareCall(sql);
			cs.setInt(1, r.getEmployee_id());
			cs.setInt(2, r.getCourse_id());
			cs.setFloat(3, r.getReimbursement_amount());
			cs.setString(4, r.getComments());
			// Get the current number in the sequence
			cs.registerOutParameter(5, java.sql.Types.INTEGER);

			cs.executeQuery();

			r.setReimbursement_id(cs.getInt(5)); 

			System.out.println(r.getReimbursement_id());

			System.out.println(r);
			return r.getReimbursement_id(); 

		} catch (SQLException s) { 
			s.printStackTrace();
		}
		return 0;

	}

//	@Override
//	public boolean calculateReimbursementLeft(float reimbursement_left, int employee_id) {
//		try {
//			String sql1 = "UPDATE reimbursement SET reimbursement_left = ? WHERE employee_id = ?";
//			PreparedStatement ps = conn.prepareStatement(sql1);
//			ps.setFloat(1, reimbursement_left);
//			ps.setInt(2, employee_id);
//		
//			return true;
//		}catch(SQLException s) {
//			s.printStackTrace();
//		}
//		return false;
//	}

}
