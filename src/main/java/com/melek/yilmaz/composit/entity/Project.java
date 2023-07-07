package com.melek.yilmaz.composit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project { //yapılacak işin yapısı
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long projectId;
	private String projectName;
	
	
	public Project(int i, String string) {
		
	}


	public long getProjectId() {
		return projectId;
	}


	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	

}
