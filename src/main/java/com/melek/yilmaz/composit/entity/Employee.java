package com.melek.yilmaz.composit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Employee { //işi alan kişi
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long employeeId;
	private String employeeName;
	
	public Employee() {
		
	}
	
	public Employee(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	
	
	
	
	

}
