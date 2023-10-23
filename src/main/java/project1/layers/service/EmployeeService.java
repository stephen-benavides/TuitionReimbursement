package project1.layers.service;

import project1.layers.dao.EmployeeDAO;
import project1.layers.dao.EmployeeDAOImpl;
import project1.layers.models.Employee;

public class EmployeeService {
	
	public static EmployeeDAO ed = new EmployeeDAOImpl();
	
	public static boolean addEmployee(Employee e) {
		return ed.addEmployee(e);
	}
	
	public static boolean logging(String username, String password) {
		return ed.logging(username, password);
		
	}
}
