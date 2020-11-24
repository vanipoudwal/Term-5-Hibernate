
package com.learning.hibernate.model;

public class Course 
{
	private int Id;
	private String CourseName;
	private double Duration;
	private double Fee;
	private String Faculty;
	private String Qualification;

	// Default Constructor
	public Course() {}
	
	// Parameterized Constructor
	public Course(int Id, String CourseName, double Duration, double Fee, String Faculty, String Qualification)
	{
		super();
		this.Id = Id;
		this.CourseName = CourseName;
		this.Duration = Duration;
		this.Fee = Fee;
		this.Faculty = Faculty;
		this.Qualification = Qualification;
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

	public String getCourseName()
	{
		return CourseName;
	}
	public void setCourseName(String CourseName)
	{
		this.CourseName = CourseName;
	}

	public double getDuration()
	{
		return Duration;
	}
	public void setDuration(double Duration)
	{
		this.Duration = Duration;
	}

	public double getFee()
	{
		return Fee;
	}
	public void setFee(double Fee)
	{
		this.Fee = Fee;
	}

	public String getFaculty()
	{
		return Faculty;
	}
	public void setFaculty(String Faculty)
	{
		this.Faculty = Faculty;
	}

	public String getQualification()
	{
		return Qualification;
	}
	public void setQualification(String Qualification)
	{
		this.Qualification = Qualification;
	}

	@Override
	public String toString()
	{
		return "Course [Id = " + Id + ", CourseName = " + CourseName + ", Duration = " + Duration + ", Fee = " + Fee
				+ ", Faculty = " + Faculty + ", Qualification = " + Qualification + "]";
	}
}
