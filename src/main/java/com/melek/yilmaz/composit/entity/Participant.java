package com.melek.yilmaz.composit.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

//ayrı bir key yapılmaz çünkü proje ve employee ile bağımlı
// projenin idsi ve employeenin idsinden oluşan bir key kullanılır.Composit primary key


@Entity
public class Participant {  //bir projede bir employeenin rolüdür
	
	@EmbeddedId //ParticipantId classının attributeleri Participant entitysinin içinde gömülü olarak kabul edilir
	private ParticipantId participantId;
	//ayrı bir id tanımlamak yerine projectId ve employeeIdden oluşan composit ıd tanımlanır
	private String roleName;
	
	
	
	
	
	public Participant(ParticipantId participantId, String roleName) {
		super();
		this.participantId = participantId;
		this.roleName = roleName;
	}
	
	
	public ParticipantId getParticipantId() {
		return participantId;
	}
	public void setParticipantId(ParticipantId participantId) {
		this.participantId = participantId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	


}
