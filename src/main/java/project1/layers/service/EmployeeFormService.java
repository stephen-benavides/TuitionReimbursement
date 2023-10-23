package project1.layers.service;

import project1.layers.dao.EmployeeFormDAO;
import project1.layers.dao.EmployeeFormDAOImpl;
import project1.layers.models.EmployeeFormSubmit;

public class EmployeeFormService {

	static EmployeeFormDAO ed = new EmployeeFormDAOImpl();
	
	public static void addForm(EmployeeFormSubmit e) {
		ed.addForm(e);
		return;
	}
}
