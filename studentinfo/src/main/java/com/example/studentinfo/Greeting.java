package com.example.studentinfo;

import org.springframework.beans.factory.annotation.Autowired;

public class Greeting {

	public int rollno;
	public String name;
	public String stream;
	public String grade;
		
	
	
	
	public Greeting() {
		super();
	}
	@Autowired
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
