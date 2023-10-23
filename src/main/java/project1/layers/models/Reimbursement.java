package project1.layers.models;

public class Reimbursement {

	int reimbursement_id;
	int employee_id;
	int course_id;
	String status;
	float reimbursement_amount;
	String comments;
	
	public Reimbursement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reimbursement(int reimbursement_id, int employee_id, int course_id, String status,
			float reimbursement_amount, String comments) {
		super();
		this.reimbursement_id = reimbursement_id;
		this.employee_id = employee_id;
		this.course_id = course_id;
		this.status = status;
		this.reimbursement_amount = reimbursement_amount;
		this.comments = comments;
	}
	
	

	public Reimbursement(int employee_id, int course_id, String status, float reimbursement_amount, String comments) {
		super();
		this.employee_id = employee_id;
		this.course_id = course_id;
		this.status = status;
		this.reimbursement_amount = reimbursement_amount;
		this.comments = comments;
	}

	public int getReimbursement_id() {
		return reimbursement_id;
	}

	public void setReimbursement_id(int reimbursement_id) {
		this.reimbursement_id = reimbursement_id;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public float getReimbursement_amount() {
		return reimbursement_amount;
	}

	public void setReimbursement_amount(float reimbursement_amount) {
		this.reimbursement_amount = reimbursement_amount;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Reimbursement [reimbursement_id=" + reimbursement_id + ", employee_id=" + employee_id + ", course_id="
				+ course_id + ", status=" + status + ", reimbursement_amount=" + reimbursement_amount + ", comments="
				+ comments + "]";
	}

	

	
	
}
