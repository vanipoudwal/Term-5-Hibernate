
package com.learning.hibernate.driver;

import java.util.List;
import com.learning.hibernate.dao.CourseDAO;
import com.learning.hibernate.dao.impl.CourseDAOImpl;
import com.learning.hibernate.model.Course;

public class CourseDriver
{
	public static void main(String[] args)
	{	
		CourseDAO courseDAO = new CourseDAOImpl();
		
		int Choice = 2;
		switch(Choice)
		{
			case 1: 
				Course stu1 = new Course(1001, "GNIIT", 2.5, 200000, "Guddu Rangeela", "Under Graduate");
				courseDAO.saveCourse(stu1);
				break;
			
			case 2: 
				Course stu2 = courseDAO.getCoursebyId(1);
				stu2.setQualification("Post Graduate");
				courseDAO.updateCourse(stu2);
				break;
			
			case 3: 
				Course stu3 = courseDAO.getCoursebyId(3);
				courseDAO.deleteCourse(stu3);
				break;
		
			case 4: 
				Course stu4 = courseDAO.getCoursebyId(3);
				System.out.println(stu4);
				break;
		
			case 5: 
				List<Course> stu5 = courseDAO.getAllCourses();
				System.out.println(stu5);
			
			case 6:
				System.exit(0);

			default:
				System.out.println("Please Enter A Valid Choice");
		}
	}
}
