
package com.learning.hibernate.dao;

import java.util.List;
import com.learning.hibernate.model.Student;

public interface StudentDAO
{	
	public boolean saveStudent(Student student);
	public boolean deleteStudent(Student student);
	public Student getStudentbyId(int id);
	public boolean updateStudent(Student student);
	public List<Student> getAllStudents();
}
