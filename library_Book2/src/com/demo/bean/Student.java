package com.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "studentdetails")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="id")
	@SequenceGenerator(name="id",sequenceName = "seqprodid",initialValue = 1,allocationSize = 1)
private int id;
private String name;
private String email;
private int phoneno;
private String branch;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getPhoneno() {
	return phoneno;
}
public void setPhoneno(int phoneno) {
	this.phoneno = phoneno;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public Student(String name, String email, int phoneno, String branch) {
	super();
	this.name = name;
	this.email = email;
	this.phoneno = phoneno;
	this.branch = branch;
}

public Student(int id, String name, String email, int phoneno, String branch) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.phoneno = phoneno;
	this.branch = branch;
	
}
public Student(int id) {
	super();
	this.id = id;
}
public Student() {
	super();
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", email=" + email + ", phoneno=" + phoneno + ", branch=" + branch
			+ ", toString()=" + super.toString() + "]";
}




}



