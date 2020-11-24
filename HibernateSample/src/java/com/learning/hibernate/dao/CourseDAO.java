
package com.learning.hibernate.dao;

import java.util.List;
import com.learning.hibernate.model.Course;

public interface CourseDAO
{	
	public boolean saveCourse(Course course);	
	public boolean deleteCourse(Course course);
	public Course getCoursebyId(int id);
	public boolean updateCourse(Course course);
	public List<Course> getAllCourses();
}
