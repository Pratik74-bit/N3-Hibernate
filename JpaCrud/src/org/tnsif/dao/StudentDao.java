package org.tnsif.dao;

import org.tnsif.entities.Student;

public interface StudentDao {
	
	void addStudent(Student student); 		//creation
	Student getStudent(int rollno); 		//retrieve
	void updateStudent(Student student); 	//update
	void removeStudent(Student student);	//delete
	
	void beginTransaction();
	void commitTransaction();

}
