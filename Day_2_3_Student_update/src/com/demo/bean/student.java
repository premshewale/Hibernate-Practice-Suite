package com.demo.bean;

public class student {

	private int rollno;
	private String sname;
	private double percentage;
	private String DOB;
	public student(int rollno, String sname, double percentage, String dOB) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.percentage = percentage;
		DOB = dOB;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	
	public student() {
		super();
	}
	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", sname=" + sname + ", percentage=" + percentage + ", DOB=" + DOB + "]";
	}
	
	
	
	
	
}
