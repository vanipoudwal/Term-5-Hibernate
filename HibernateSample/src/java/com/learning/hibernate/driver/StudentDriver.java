
package com.learning.hibernate.driver;

import java.util.List;
import com.learning.hibernate.dao.StudentDAO;
import com.learning.hibernate.dao.impl.StudentDAOImpl;
import com.learning.hibernate.model.Student;

public class StudentDriver
{
	public static void main(String[] args)
	{	
		StudentDAO studentDAO = new StudentDAOImpl();
		
		int Choice = 2;
		switch(Choice)
		{
			case 1: 
				Student stu1 = new Student(0001, "Vani Poudwal", "vani#1612", "vanip@niit.com", 98765, "Female", "Panchsheel Park");
				studentDAO.saveStudent(stu1);
				break;
			
			case 2: 
				Student stu2 = studentDAO.getStudentbyId(1);
				stu2.setAddress("Greater Kailash");
				studentDAO.updateStudent(stu2);
				break;
			
			case 3: 
				Student stu3 = studentDAO.getStudentbyId(3);
				studentDAO.deleteStudent(stu3);
				break;
		
			case 4: 
				Student stu4 = studentDAO.getStudentbyId(3);
				System.out.println(stu4);
				break;
		
			case 5: 
				List<Student> stu5 = studentDAO.getAllStudents();
				System.out.println(stu5);
			
			case 6:
				System.exit(0);

			default:
				System.out.println("Please Enter A Valid Choice");
		}
	}
}
