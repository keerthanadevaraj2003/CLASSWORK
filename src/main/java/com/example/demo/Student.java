package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
	@JsonIgnore
	private int rollno;
	@JsonProperty("Student_name")
	private String name;	
	private int rank;
	public Student(int rollno, String name, int rank) {
		super();
		this.setRollno(rollno);
		this.setName(name);
		this.setRank(rank);
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	

}
