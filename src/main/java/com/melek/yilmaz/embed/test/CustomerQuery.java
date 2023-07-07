package com.melek.yilmaz.embed.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.melek.yilmaz.embed.entity.Customer;

public class CustomerQuery {
	
	public static void main(String [] args) {
		
		String districtName="Fatih";
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("OurPersistenceUnit");
		EntityManager entityManager=factory.createEntityManager();
		entityManager.getTransaction().begin();
		
		String jpql="select customer from Customer as customer " +
		"where customer.address.districtName= : districtName " ; 
		//İlişkilerdeki gibi önce classın adını yazıp sonra içindeki nesneyi yazıp attributesini yazarız
		//customer. address. districtName
		//class.    nesne.   .attribute
		
		
		TypedQuery<Customer> query=entityManager.createNamedQuery(jpql, Customer.class);
		query.setParameter("districtName", districtName);
		List<Customer> productList=query.getResultList();
		
		
		entityManager.close();
		
		
		for(Customer customer: productList) {
			
			System.out.println(customer.getCustomerId()+ " " + customer.getCustomerName() + " " 
			+ customer.getAddress().getProvinceName() + " " + customer.getAddress.customer.getDistrictName()
			+ customer.getAddress.getAddressLine1() + " " + customer.getAddress.getAddressLine2()
			);
			
			
		}
	}

}
