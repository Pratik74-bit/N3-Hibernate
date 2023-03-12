package org.tnsif.unidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneUnidirectional {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//first employee
		Employee emp1=new Employee();
		emp1.setEmpname("Manoj Tiwari");
		
		//second employee
		Employee emp2=new Employee();
		emp2.setEmpname("Sahil Pawar");
		
		//first address
		Address a1 = new Address();
		a1.setPincode(422206);
		a1.setArea("Trimurti chowk");
		a1.setCity("Nashik");
		a1.setState("Maharashtra");
		
		//second address
		Address a2 = new Address();
		a2.setPincode(422207);
		a2.setArea("Dadar");
		a2.setCity("Mumbai");
		a2.setState("Maharashtra");
		
		emp2.setAddress(a1);
		emp1.setAddress(a1);
		
		em.persist(emp1);
		em.persist(emp2);
		
		em.getTransaction().commit();
		System.out.println("Data added successfully");
		em.close();

		factory.close();


	}

}
