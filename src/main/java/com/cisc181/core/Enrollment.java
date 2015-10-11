/**
 * 
 */
package com.cisc181.core;

/**
 * @author Chris
 *
 */
public class Enrollment {
private int SectionID;
private int StudentID;
private int EnrollmentID;
private double Grade;

	/**
	 * 
	 */
	public Enrollment() {
		// TODO Auto-generated constructor stub
	}
	public Enrollment(int SectionID, int StudentID){
		this.StudentID = StudentID;
		this.SectionID = SectionID;
		this.EnrollmentID = EnrollmentID;
	}
	public void setGrade(double Grade){
		this.Grade = Grade;
	}
	public double getGrade(){
		return Grade;
	}
}
