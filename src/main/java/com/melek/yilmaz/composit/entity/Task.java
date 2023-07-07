package com.melek.yilmaz.composit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

//ManyToOne ilişkisi kuran entitynin iki tane fieldi olduğunda foreignkey oluşturulur

@Entity
public class Task {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long taskId;
	private String taskName;
	
	

	
	//manyToOneİliskisi
	//Bir katılımcının briden fazla görevi (task) olablir
	//Bir yönetici birden fazla görevi (taskı) yönetebilir
	
	
	
	
	@ManyToOne 
	@JoinColumns({   //task varlığına karşılık gelen tabloda iki tane foreignkey için field olacak
		@JoinColumn(name="projectIdParticipant", referencedColumnName="projectId"),
		@JoinColumn(name="employeeIdParticipant", referencedColumnName="employeeId")
		
	})
	private Participant participant;//bir katılımcının birden fazla görevi olur
	
	
	
	public Task(long taskId, String taskName, Participant participant, Director directory) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.participant = participant;
		this.directory = directory;
	}
	
	
	@ManyToOne
	@JoinColumns({   //task varlığına karşılık gelen tabloda iki tane foreignkey için field olacak
		@JoinColumn(name="projectIdDirector", referencedColumnName="projectId"),
		@JoinColumn(name="employeeIdDirector", referencedColumnName="employeeId")
		
	})
	private Director directory; //Bir yöneticinin yönettiği işlemlerle ilgili tasklar birden fazla olabilir
	public long getTaskId() {
		return taskId;
	}
	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public Participant getParticipant() {
		return participant;
	}
	public void setParticipant(Participant participant) {
		this.participant = participant;
	}
	public Director getDirectory() {
		return directory;
	}
	public void setDirectory(Director directory) {
		this.directory = directory;
	}
	
	
	
	
	
	
	
}
