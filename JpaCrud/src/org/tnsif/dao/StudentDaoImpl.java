package org.tnsif.dao;

import javax.persistence.EntityManager;
import org.tnsif.entities.Student;

public class StudentDaoImpl implements StudentDao{
	
	private EntityManager em;
	

	public StudentDaoImpl() {
		em = JPAUtil.getEntityManager();
	}
	
	
	//creation / Insertion / Add
	@Override
	public void addStudent(Student student) {
		em.persist(student);
	}

	@Override
	public Student getStudent(int rollno) {
		Student student = em.find(Student.class, rollno);
		return student;
	}

	//Updation
	@Override
	public void updateStudent(Student student) {
		em.merge(student);
	}
	
	//Deletion
	@Override
	public void removeStudent(Student student) {
		em.remove(student);	
	}
	
	
	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();	
	}
	
	

}
