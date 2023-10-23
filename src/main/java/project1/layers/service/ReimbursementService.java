package project1.layers.service;

import project1.layers.dao.ReimbursementDAO;
import project1.layers.dao.ReimbursementDAOImpl;
import project1.layers.models.Reimbursement;

public class ReimbursementService {
	static ReimbursementDAO rd = new ReimbursementDAOImpl();
	
	public static int addReimbursement(Reimbursement r) {
		return rd.addReimbursement(r);
	}
	
//	public static boolean calculateReimbursementLeft(float reimbursement_left, int employee_id) {
//		return rd.calculateReimbursementLeft(reimbursement_left, employee_id);
//	}
	
}
  