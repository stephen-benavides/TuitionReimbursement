package project1.layers.models;

public class EmployeeFormSubmit {

	
	String firstname;
	String lastname;
	String location;
	String description;
	int cost;
	String grade;
	int course_type_id;
	String justification;
	
	
	
	public EmployeeFormSubmit() {
		super();
		// TODO Auto-generated constructor stub
	}

 

	public EmployeeFormSubmit(String firstname, String lastname, String location, String description, int cost,
			String grade, int course_type_id, String justification) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.location = location;
		this.description = description;
		this.cost = cost;
		this.grade = grade;
		this.course_type_id = course_type_id;
		this.justification = justification;
	}



	public EmployeeFormSubmit(String lastname, String location, String description, int cost, String grade,
			int course_type_id, String justification) {
		super();
		this.lastname = lastname;
		this.location = location;
		this.description = description;
		this.cost = cost;
		this.grade = grade;
		this.course_type_id = course_type_id;
		this.justification = justification;
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



	public int getCost() {
		return cost;
	}



	public void setCost(int cost) {
		this.cost = cost;
	}



	public String getGrade() {
		return grade;
	}



	public void setGrade(String grade) {
		this.grade = grade;
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



	@Override
	public String toString() {
		return "EmployeeFormSubmit [firstname=" + firstname + ", lastname=" + lastname + ", location=" + location
				+ ", description=" + description + ", cost=" + cost + ", grade=" + grade + ", course_type_id="
				+ course_type_id + ", justification=" + justification + "]";
	}

	
	
	
	
}
