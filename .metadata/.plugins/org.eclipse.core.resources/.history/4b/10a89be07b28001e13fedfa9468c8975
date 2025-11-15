package com.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="EmpDEVTPCC22july")
public class Developer  extends Employee{

	private double bonus;

	public Developer(double bonus) {
		super();
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public Developer(int empno, String name, double salary) {
		super(empno, name, salary);
	}
	

	public Developer(String name, double salary, double bonus) {
		super(name, salary);
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Developer [getEmpno()=" + getEmpno() + ", getName()=" + getName() + ", getSalary()=" + getSalary()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
}
