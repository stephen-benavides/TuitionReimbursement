package project1.layers.models;

public class Employee {

	int employee_id;
	int role_id;
	String firstname;
	String lastname;
	String username;
	String password;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int role_id, String firstname, String lastname, String username, String password) {
		super();
		this.role_id = role_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
	}
	
	

	public Employee(int employee_id, int role_id, String firstname, String lastname, String username, String password) {
		super();
		this.employee_id = employee_id;
		this.role_id = role_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", role_id=" + role_id + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", username=" + username + ", password=" + password + "]";
	}
	
	
}
