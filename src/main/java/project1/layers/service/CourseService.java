package project1.layers.service;

import project1.layers.dao.CourseDAO;
import project1.layers.dao.CourseDAOImpl;
import project1.layers.models.Course;

public class CourseService {

	static CourseDAO cd = new CourseDAOImpl();
	
	//Returns the course_id
	public static int addCourse(Course c) {
		return cd.addCourse(c);
	}
}
