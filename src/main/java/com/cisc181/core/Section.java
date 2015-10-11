package com.cisc181.core;

public class Section {
private int SectionID;
private int RoomID;

	public Section() {
		// TODO Auto-generated constructor stub
	}
	public Section(int UUID, int SemesterID, int SectionID, int RoomID){
		this.SectionID = SectionID;
		this.RoomID = RoomID;
	
	}
	public void setSectionID(int SectionID){
		this.SectionID = SectionID;
	}
	public int getSectionID(){
		return SectionID;
	}
	public void setRoomID(int RoomID){
		this.RoomID = RoomID;
	}
	public int getRoomID(){
		return RoomID;
	}
}
