package com.example.servicei;

import com.example.model.Student;

public interface ServiceI {

	void saveStudent(Student s);

	void getStudent(int id);

	void deleteStudent(int id);

	void updteStudent(int id);

	void deleteAllStudent();

	Iterable<Student> deleteAllStudent(int id);

}
