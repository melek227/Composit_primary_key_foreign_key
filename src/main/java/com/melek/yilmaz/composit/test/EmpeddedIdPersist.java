package com.melek.yilmaz.composit.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.melek.yilmaz.composit.entity.Employee;
import com.melek.yilmaz.composit.entity.Participant;
import com.melek.yilmaz.composit.entity.ParticipantId;
import com.melek.yilmaz.composit.entity.Project;

public class EmpeddedIdPersist {
	
	
	public static void main(String [] args) {
		
		
		Employee employee=new Employee(0,"çalışan 1");
		Project project=new Project(0,"izdüşü 1");
		
		//composit primary keyin attributelerinin başvurduğu entitylerin örneği oluşturuldu
		
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("OurPersistenceUnit");
		EntityManager entityManager=factory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		
		entityManager.persist(employee);
		entityManager.persist(project);
		entityManager.getTransaction().commit();
		
		
		
		ParticipantId participandId=new ParticipantId(employee.getEmployeeId(), project.getProjectId());
		/*Composit primary keyin attributelerini oluşturulan employeeId ve projectId ile 
		 composit primary keyin bir örneği tanımlandı
		*/
		
		Participant participant1=new Participant(participandId, "mühendis");
		//composit primary keyi olan entitynin örneği oluşturuldu
		
		
		entityManager.getTransaction().begin();
		entityManager.persist(participant1);
		entityManager.getTransaction().commit();
		
		
		entityManager.close();
		
		
	}

}
