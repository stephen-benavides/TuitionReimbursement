package project1.layers.models;

public class ApprovalForm {
	//Employee Information
	String date;
	String time;
	//REIMBURSEMENT_ID
	int reimbursement_id;
	String firstname;
	String lastname;
	String location;
	int course_type_id;
	String grade;
	
	int course_cost;
	String description;
	String justification;

	//Employer Information
	String passing_grade;
	String status;
	String comments;
	
	//BenCo Information
	int approved;
	//Reimbursement after the class % has been discounted 
	int reimbursement_amount;
	
	
	int course_id;
	

	public ApprovalForm() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ApprovalForm(String date, String time, int reimbursement_id, String firstname, String lastname,
			String location, int course_type_id, String grade, int course_cost, String description,
			String justification, String passing_grade, String status, String comments, int approved,
			int reimbursement_amount, int course_id) {
		super();
		this.date = date;
		this.time = time;
		this.reimbursement_id = reimbursement_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.location = location;
		this.course_type_id = course_type_id;
		this.grade = grade;
		this.course_cost = course_cost;
		this.description = description;
		this.justification = justification;
		this.passing_grade = passing_grade;
		this.status = status;
		this.comments = comments;
		this.approved = approved;
		this.reimbursement_amount = reimbursement_amount;
		this.course_id = course_id;
	}


	public ApprovalForm(String date, String time, int reimbursement_id, String firstname, String lastname,
			String location, int course_type_id, String grade, int course_cost, String description,
			String justification, String passing_grade, String status, String comments, int approved,
			int reimbursement_amount) {
		super();
		this.date = date;
		this.time = time;
		this.reimbursement_id = reimbursement_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.location = location;
		this.course_type_id = course_type_id;
		this.grade = grade;
		this.course_cost = course_cost;
		this.description = description;
		this.justification = justification;
		this.passing_grade = passing_grade;
		this.status = status;
		this.comments = comments;
		this.approved = approved;
		this.reimbursement_amount = reimbursement_amount;
	}


	public ApprovalForm(String date, String time, String firstname, String lastname, String location,
			int course_type_id, String grade, int course_cost, String description, String justification,
			String passing_grade, String status, String comments, int approved, int reimbursement_amount,
			int course_id) {
		super();
		this.date = date;
		this.time = time;
		this.firstname = firstname;
		this.lastname = lastname;
		this.location = location;
		this.course_type_id = course_type_id;
		this.grade = grade;
		this.course_cost = course_cost;
		this.description = description;
		this.justification = justification;
		this.passing_grade = passing_grade;
		this.status = status;
		this.comments = comments;
		this.approved = approved;
		this.reimbursement_amount = reimbursement_amount;
		this.course_id = course_id;
	}


	public ApprovalForm(String date, String time, String firstname, String lastname, String location,
			int course_type_id, String grade, int course_cost, String description, String justification,
			String passing_grade, String status, String comments, int approved, int reimbursement_amount) {
		super();
		this.date = date;
		this.time = time;
		this.firstname = firstname;
		this.lastname = lastname;
		this.location = location;
		this.course_type_id = course_type_id;
		this.grade = grade;
		this.course_cost = course_cost;
		this.description = description;
		this.justification = justification;
		this.passing_grade = passing_grade;
		this.status = status;
		this.comments = comments;
		this.approved = approved;
		this.reimbursement_amount = reimbursement_amount;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public int getReimbursement_id() {
		return reimbursement_id;
	}


	public void setReimbursement_id(int reimbursement_id) {
		this.reimbursement_id = reimbursement_id;
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


	public int getCourse_type_id() {
		return course_type_id;
	}


	public void setCourse_type_id(int course_type_id) {
		this.course_type_id = course_type_id;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public int getCourse_cost() {
		return course_cost;
	}


	public void setCourse_cost(int course_cost) {
		this.course_cost = course_cost;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getJustification() {
		return justification;
	}


	public void setJustification(String justification) {
		this.justification = justification;
	}


	public String getPassing_grade() {
		return passing_grade;
	}


	public void setPassing_grade(String passing_grade) {
		this.passing_grade = passing_grade;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}


	public int getApproved() {
		return approved;
	}


	public void setApproved(int approved) {
		this.approved = approved;
	}


	public int getReimbursement_amount() {
		return reimbursement_amount;
	}


	public void setReimbursement_amount(int reimbursement_amount) {
		this.reimbursement_amount = reimbursement_amount;
	}


	public int getCourse_id() {
		return course_id;
	}


	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}


	@Override
	public String toString() {
		return "ApprovalForm [date=" + date + ", time=" + time + ", reimbursement_id=" + reimbursement_id
				+ ", firstname=" + firstname + ", lastname=" + lastname + ", location=" + location + ", course_type_id="
				+ course_type_id + ", grade=" + grade + ", course_cost=" + course_cost + ", description=" + description
				+ ", justification=" + justification + ", passing_grade=" + passing_grade + ", status=" + status
				+ ", comments=" + comments + ", approved=" + approved + ", reimbursement_amount=" + reimbursement_amount
				+ ", course_id=" + course_id + "]";
	}



	
	
}
