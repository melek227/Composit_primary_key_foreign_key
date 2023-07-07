package com.melek.yilmaz.composit.entity;

import java.io.Serializable;
import java.util.Objects;


//serializable diske yazılabilmesini sağlar

//primary key birden fazla attributeden oluşabilir
/*birden fazla attributeden oluşan primarykeyin her bir attributesinin başka bir entitye
başvuru yapmasıyla composit primary key oluşur*/

//composit primary key ParticipantId

public class ParticipantId implements Serializable { 
	
	private long employeeId; //employee entitysinden gelen ıd
	private long projectId; //project entitysinden gelen ıd
	
	public ParticipantId(long l, long m) {
		
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	@Override
	public String toString() { //participantId birden fazla ıdden oluştuğu için toString yaptık
		return "ParticipantId [employeeId=" + employeeId + ", projectId=" + projectId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeId, projectId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParticipantId other = (ParticipantId) obj;
		return employeeId == other.employeeId && projectId == other.projectId;
	}
	
	
	
	

}
