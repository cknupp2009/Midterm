/**
 * 
 */
package com.cisc181.core;
import java.util.Date;

/**
 * @author Chris
 *
 */
public class Semester {
private int SemesterID;
private Date Startdate;
private Date Enddate;


	/**
	 * 
	 */
	public Semester() {
		// TODO Auto-generated constructor stub
	}
	public Semester(int SemesterID, Date Startedate, Date Enddate){
		this.SemesterID = SemesterID;
		this.Startdate = Startdate;
		this.Enddate = Enddate;
	}
	public void setSemesterID(int SemesterID){
		this.SemesterID = SemesterID;
	}
	public int getSemesterID(){
		return SemesterID;
	}
	public void setStartdate(Date Startdate){
		this.Startdate = Startdate;
	}
	public Date getStartdate(){
		return Startdate;
	}
	public void setEnddate(Date Enddate){
		this.Enddate = Enddate;
	}
	public Date getEnddate(){
		return Enddate;
	}
}
