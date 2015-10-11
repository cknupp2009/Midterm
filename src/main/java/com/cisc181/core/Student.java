package com.cisc181.core;

import java.util.Date;

public class Student extends Person {

	private String eMajor;
	
	public String geteMajor ( )
    {
        return this.eMajor;
    }
    public void seteMajor (String eMajor)
    {
        this.eMajor = eMajor;           
    }
    
	public Student(String FirstName, String MiddleName, String LastName,Date DOB, String Major,
			String Address, String Phone_number, String Email) 
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
		this.eMajor = eMajor;
		
	}
	
	@Override
	public void PrintName() {
		System.out.println(getLastName() + ","  + getFirstName() + ' ' + getMiddleName());
	}

	public void PrintName(boolean bnormal)
	{
		super.PrintName();
	}
}