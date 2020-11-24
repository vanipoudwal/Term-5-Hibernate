
package com.learning.hibernate.dao;

import java.util.List;
import com.learning.hibernate.model.Employee;

public interface EmployeeDAO
{	
	public boolean saveEmployee(Employee employee);	
	public boolean deleteEmployee(Employee employee);
	public Employee getEmployeebyId(int id);
	public boolean updateEmployee(Employee employee);
	public List<Employee> getAllEmployees();
}
