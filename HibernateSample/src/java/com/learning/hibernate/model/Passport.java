
package com.learning.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // It will map the Java class with database table -->> Mandatory
@Table(name = "Passport") // you can create custom table name in Database

public class Passport
{
	// Attribute level Annotations
		@Id // It will make this property as a Primary key in the database table
		@Column(name = "Passport_Id")
		@GeneratedValue // It will generate a unique value for this and increments automatically
			private int Id;
		@Column(name = "Passport_Number")
			private String PassportNumber;
		@Column(name = "Passport_Authority")
			private String Authority;

	// Default Constructor
	public Passport() {}

	// Parameterized Constructor
	public Passport(String PassportNumber, String Authority)
	{
		super();
		this.PassportNumber = PassportNumber;
		this.Authority = Authority;
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

	public String getPassportNumber()
	{
		return PassportNumber;
	}
	public void setPassportNumber(String PassportNumber)
	{
		this.PassportNumber = PassportNumber;
	}

	public String getAuthority()
	{
		return Authority;
	}
	public void setAuthority(String Authority)
	{
		this.Authority = Authority;
	}

	@Override
	public String toString()
	{
		return "Passport [Id = " + Id + ", PassportNumber = " + PassportNumber + ", Authority = " + Authority + "]";
	}
}
