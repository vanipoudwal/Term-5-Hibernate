
package com.learning.hibernate.model;

public class Student
{
	// Id will work as a primary key
	private int Id;
	private String Username;
	private String Password;
	private String Email;
	private long Phone;
	private String Gender;
	private String Address;
	
	// Default Constructor
	public Student() {}
	
   // Parameterized constructor
	public Student(int Id, String Username, String Password, String Email, long Phone, String Gender, String Address)
	{
		super();
		this.Id = Id;
		this.Username = Username;
		this.Password = Password;
		this.Email = Email;
		this.Phone = Phone;
		this.Gender = Gender;
		this.Address = Address;
	}

	// Getters and Setters for All the Properties
	public int getId()
	{
		return Id;
	}
	public void setId(int Id)
	{
		this.Id = Id;
	}

	public String getUsername()
	{
		return Username;
	}
	public void setUsername(String Username)
	{
		this.Username = Username;
	}

	public String getPassword()
	{
		return Password;
	}
	public void setPassword(String Password)
	{
		this.Password = Password;
	}

	public String getEmail()
	{
		return Email;
	}
	public void setEmail(String Email)
	{
		this.Email = Email;
	}

	public long getPhone()
	{
		return Phone;
	}
	public void setPhone(long Phone)
	{
		this.Phone = Phone;
	}

	public String getGender()
	{
		return Gender;
	}
	public void setGender(String Gender)
	{
		this.Gender = Gender;
	}

	public String getAddress()
	{
		return Address;
	}
	public void setAddress(String Address)
	{
		this.Address = Address;
	}
	
	@Override
	public String toString()
	{
		return "Student [Id = " + Id + ", Username = " + Username + ", Password = " + Password + ", Email = " + Email
				+ ", Phone = " + Phone + ", Gender = " + Gender + ", Address = " + Address + "]";
	}
}
