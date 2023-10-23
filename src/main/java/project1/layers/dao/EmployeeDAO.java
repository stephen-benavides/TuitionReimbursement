package project1.layers.dao;

import project1.layers.models.Employee;

public interface EmployeeDAO {
	
	//Add Employee
	public boolean addEmployee(Employee e);
	
	//Employee Login
	public boolean logging(String username, String password);
	
	
}
