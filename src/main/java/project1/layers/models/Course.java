package project1.layers.models;

public class Course {

	int course_id;
	int course_type_id;
	int course_cost;
	int grades_id;
	String passing_grade;
	int approved;
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Course(int course_id, int course_type_id, int course_cost, int grades_id, String passing_grade,
			int approved) {
		super();
		this.course_id = course_id;
		this.course_type_id = course_type_id;
		this.course_cost = course_cost;
		this.grades_id = grades_id;
		this.passing_grade = passing_grade;
		this.approved = approved;
	}


	public Course(int course_type_id, int course_cost, int grades_id, String passing_grade, int approved) {
		super();
		this.course_type_id = course_type_id;
		this.course_cost = course_cost;
		this.grades_id = grades_id;
		this.passing_grade = passing_grade;
		this.approved = approved;
	}


	public int getCourse_id() {
		return course_id;
	}


	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}


	public int getCourse_type_id() {
		return course_type_id;
	}


	public void setCourse_type_id(int course_type_id) {
		this.course_type_id = course_type_id;
	}


	public int getCourse_cost() {
		return course_cost;
	}


	public void setCourse_cost(int course_cost) {
		this.course_cost = course_cost;
	}


	public int getGrades_id() {
		return grades_id;
	}


	public void setGrades_id(int grades_id) {
		this.grades_id = grades_id;
	}


	public String getPassing_grade() {
		return passing_grade;
	}


	public void setPassing_grade(String passing_grade) {
		this.passing_grade = passing_grade;
	}


	public int getApproved() {
		return approved;
	}


	public void setApproved(int approved) {
		this.approved = approved;
	}


	@Override
	public String toString() {
		return "Course [course_id=" + course_id + ", course_type_id=" + course_type_id + ", course_cost=" + course_cost
				+ ", grades_id=" + grades_id + ", passing_grade=" + passing_grade + ", approved=" + approved + "]";
	}


	
	
}
