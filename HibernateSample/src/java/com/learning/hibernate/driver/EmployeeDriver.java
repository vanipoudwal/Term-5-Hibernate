
package com.learning.hibernate.driver;

import java.util.List;
import com.learning.hibernate.dao.EmployeeDAO;
import com.learning.hibernate.dao.impl.EmployeeDAOImpl;
import com.learning.hibernate.model.Employee;

public class EmployeeDriver
{
	public static void main(String[] args)
	{	
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		
		int Choice = 2;
		switch(Choice)
		{
			case 1: 
				Employee emp1 = new Employee("Akshay Kumar", "Finance");
				employeeDAO.saveEmployee(emp1);
				break;
			
			case 2: 
				Employee emp2 = employeeDAO.getEmployeebyId(1);
				emp2.setDeptt("Sales");
				employeeDAO.updateEmployee(emp2);
				break;
			
			case 3: 
				Employee emp3 = employeeDAO.getEmployeebyId(3);
				employeeDAO.deleteEmployee(emp3);
				break;
		
			case 4: 
				Employee emp4 = employeeDAO.getEmployeebyId(3);
				System.out.println(emp4);
				break;
		
			case 5: 
				List<Employee> emp5 = employeeDAO.getAllEmployees();
				System.out.println(emp5);
			
			case 6:
				System.exit(0);

			default:
				System.out.println("Please Enter A Valid Choice");
		}
	}
}
