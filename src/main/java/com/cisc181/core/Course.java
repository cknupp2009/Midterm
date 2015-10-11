package com.cisc181.core;

public class Course {
private int UUID;
private int Gradepoint;
private String CourseName;

	public Course() {
		// TODO Auto-generated constructor stub
	}
	public Course(int UUID, String CourseName, int Gradepoint){
		this.UUID = UUID;
		this.CourseName = CourseName;
		this.Gradepoint = Gradepoint;
	}
	public void setUUID(int UUID){
		this.UUID = UUID;
	}
	public int getUUID(){
		return UUID;
	}
	
	public void setCourseName(String CourseName){
		this.CourseName = CourseName;
	}
	public String getCourseName(){
		return CourseName;
	}
	public void setGradepoint(int Gradepoint){
		this.Gradepoint = Gradepoint;
	}
	public int getGradepoint(){
		return Gradepoint;
	}
	
}
