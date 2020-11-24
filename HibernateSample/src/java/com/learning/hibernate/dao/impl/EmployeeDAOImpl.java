
package com.learning.hibernate.dao.impl;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.learning.hibernate.config.HibernateUtil;
import com.learning.hibernate.dao.EmployeeDAO;
import com.learning.hibernate.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO
{
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	@Override
	public boolean saveEmployee(Employee employee)
	{
		try
		{
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(employee);
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
	public boolean deleteEmployee(Employee employee)
	{
		try
		{
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.delete(employee);
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
	public Employee getEmployeebyId(int id)
	{
		try
		{
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			Employee employee = (Employee) session.get(Employee.class, id);
			tx.commit();
			session.close();
			return employee;
		} 
		catch (HibernateException e)
		{
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean updateEmployee(Employee employee)
	{
		try
		{
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.update(employee);
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
	public List<Employee> getAllEmployees()
	{
		try
		{
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			List<Employee> employees = session.createQuery("FROM Employee").list();
			tx.commit();
			session.close();
			return employees;
		}
		catch (HibernateException e) 
		{
			e.printStackTrace();
			return null;
		}
	}
}
