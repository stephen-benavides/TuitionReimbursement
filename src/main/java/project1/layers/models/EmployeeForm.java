package project1.layers.models;

public class EmployeeForm {

	int employee_form_id;
	int employee_id;
	int course_id; 
	String firstname;
	String lastname;
	String creation_date;
	String location;
	String description;

	int course_type_id;
	String justification;
	int reimbursement_id;
	String current_time;
	
	//Missing File Reader 
	
	
	public EmployeeForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeForm(int employee_form_id, int employee_id, int course_id, String firstname, String lastname,
			String creation_date, String location, String description, int course_type_id, String justification,
			int reimbursement_id, String current_time) {
		super();
		this.employee_form_id = employee_form_id;
		this.employee_id = employee_id;
		this.course_id = course_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.creation_date = creation_date;
		this.location = location;
		this.description = description;
		this.course_type_id = course_type_id;
		this.justification = justification;
		this.reimbursement_id = reimbursement_id;
		this.current_time = current_time;
	}

	public EmployeeForm(int employee_id, int course_id, String firstname, String lastname, String creation_date,
			String location, String description, int course_type_id, String justification, int reimbursement_id,
			String current_time) {
		super();
		this.employee_id = employee_id;
		this.course_id = course_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.creation_date = creation_date;
		this.location = location;
		this.description = description;
		this.course_type_id = course_type_id;
		this.justification = justification;
		this.reimbursement_id = reimbursement_id;
		this.current_time = current_time;
	}

	public int getEmployee_form_id() {
		return employee_form_id;
	}

	public void setEmployee_form_id(int employee_form_id) {
		this.employee_form_id = employee_form_id;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
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

	public String getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(String creation_date) {
		this.creation_date = creation_date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCourse_type_id() {
		return course_type_id;
	}

	public void setCourse_type_id(int course_type_id) {
		this.course_type_id = course_type_id;
	}

	public String getJustification() {
		return justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

	public int getReimbursement_id() {
		return reimbursement_id;
	}

	public void setReimbursement_id(int reimbursement_id) {
		this.reimbursement_id = reimbursement_id;
	}

	public String getCurrent_time() {
		return current_time;
	}

	public void setCurrent_time(String current_time) {
		this.current_time = current_time;
	}

	@Override
	public String toString() {
		return "EmployeeForm [employee_form_id=" + employee_form_id + ", employee_id=" + employee_id + ", course_id="
				+ course_id + ", firstname=" + firstname + ", lastname=" + lastname + ", creation_date=" + creation_date
				+ ", location=" + location + ", description=" + description + ", course_type_id=" + course_type_id
				+ ", justification=" + justification + ", reimbursement_id=" + reimbursement_id + ", current_time="
				+ current_time + "]";
	}


	

	
}
