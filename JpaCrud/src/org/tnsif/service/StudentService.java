package org.tnsif.service;

import org.tnsif.entities.Student;

public interface StudentService {
	
	void add(Student student);
	void update(Student student);
	void delete(Student student);
	Student get(int rollno);

}
