package com.demo.bean;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="MgrEmpTPCC22july")

public class Manager extends Employee{
  
	private double incentive;

	public double getIncentive() {
		return incentive;
	}

	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	

	public Manager(int empno, String name, double salary) {
		super(empno, name, salary);
	}

	public Manager(String name, double salary, double incentive) {
		super(name, salary);
		this.incentive = incentive;
	}

	public Manager(double incentive) {
		super();
		this.incentive = incentive;
	}

	@Override
	public String toString() {
		return "Manager [incentive=" + incentive + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
	
}
