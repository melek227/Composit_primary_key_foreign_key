package com.melek.yilmaz.composit.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.melek.yilmaz.composit.entity.Participant;
import com.melek.yilmaz.composit.entity.ParticipantId;
import com.melek.yilmaz.embed.test.Customer;

//okuyan koddur
public class EmpeddedIdFind {
	

	public static void main(String [] args) {
		long employeeId=1;
		long projectId=1;
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("OurPersistenceUnit");
		EntityManager entityManager=factory.createEntityManager();
		
		
		ParticipantId participantId=new ParticipantId(employeeId, projectId);
		Participant participant=entityManager.find(Participant.class, participantId);
		//find metotu tek bir nesne (primary key) ister participantıd bunun için oluşturuldu
		
		
		entityManager.close();
		
		
		System.out.println(participant.getParticipantId() 
		) ;
		
	}

}
