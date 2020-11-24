
package com.learning.hibernate.dao.impl;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.learning.hibernate.config.HibernateUtil;
import com.learning.hibernate.dao.StudentDAO;
import com.learning.hibernate.model.Student;

public class StudentDAOImpl implements StudentDAO
{
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	@Override
	public boolean saveStudent(Student student)
	{
		try
		{
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(student);
			tx.commit();
			session.close();
			return true;
		}
		catch (HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteStudent(Student student)
	{
		try
		{
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.delete(student);
			tx.commit();
			session.close();
			return true;
		}
		catch (HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Student getStudentbyId(int id)
	{
		try
		{
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			Student student = (Student) session.get(Student.class, id);
			tx.commit();
			session.close();
			return student;
		} 
		catch (HibernateException e)
		{
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean updateStudent(Student student)
	{
		try
		{
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.update(student);
			tx.commit();
			session.close();
			return true;
		}
		catch (HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Student> getAllStudents()
	{
		try
		{
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			List<Student> students = session.createQuery("FROM Student").list();
			tx.commit();
			session.close();
			return students;
		}
		catch (HibernateException e) 
		{
			e.printStackTrace();
			return null;
		}
	}
}
