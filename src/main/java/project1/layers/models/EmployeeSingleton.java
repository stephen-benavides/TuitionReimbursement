package project1.layers.models;

public class EmployeeSingleton {
	
	private static volatile Employee emp;
	
	public static Employee getInstance() {
		if(emp == null) {
			return emp = new Employee();
		}
		else
			return emp;
	}
	
	public static void logout() {
		emp = null;
	}

	public static void setRole_id(int role_id) {
		emp.role_id = role_id;
	}
	
	public static void setEmployee_id(int employee_id) {
		emp.employee_id = employee_id;
	}

	public static void setUsername(String username) {
		emp.username = username;
	}

	public static void setPassword(String password) {
		emp.password = password;
	}
	
	
	
	
}
