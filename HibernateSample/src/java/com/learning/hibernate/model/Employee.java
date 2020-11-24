
package com.learning.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // It will map the Java class with database table -->> Mandatory
@Table(name = "Employee") // you can create custom table name in Database

public class Employee
{
	// Attribute level Annotations
		@Id // It will make this property as a Primary key in the database table
		@Column(name = "Employee_Id")
		@GeneratedValue // It will generate a unique value for this and increments automatically
			private int Id;
		@Column(name = "Employee_Name")
			private String EmployeeName;
		@Column(name = "Employee_Deptt")
			private String Deptt;

	// Default Constructor
	public Employee() {}

	// Parameterized Constructor
	public Employee(String EmployeeName, String Deptt)
	{
		super();
		this.EmployeeName = EmployeeName;
		this.Deptt = Deptt;
	}

	// Getters & Setters
	public int getId()
	{
		return Id;
	}
	public void setId(int Id)
	{
		this.Id = Id;
	}

	public String getEmployeeName()
	{
		return EmployeeName;
	}
	public void setEmployeeName(String EmployeeName)
	{
		this.EmployeeName = EmployeeName;
	}

	public String getDeptt()
	{
		return Deptt;
	}
	public void setDeptt(String Deptt)
	{
		this.Deptt = Deptt;
	}

	@Override
	public String toString()
	{
		return "Employee [Id = " + Id + ", EmployeeName = " + EmployeeName + ", Deptt = " + Deptt + "]";
	}
}
