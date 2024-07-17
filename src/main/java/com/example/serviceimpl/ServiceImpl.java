package com.example.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Student;
import com.example.repositoryi.RepositoryI;
import com.example.servicei.ServiceI;

@Service
public class ServiceImpl implements ServiceI{

	@Autowired
	RepositoryI ri;
	
	@Override
	public void saveStudent(Student s)
	{
      
		ri.save(s);
	}


	@Override
	public void getStudent(int id) 
	{
      ri.findById(id);		
	}

	@Override
	public void deleteStudent(int id) 
	{
      ri.deleteById(id);		
	}


	@Override
	public void updteStudent(int id) 
	{
     ri.findbyId(id);		
	}


	@Override
	public void deleteAllStudent() 
	{
		ri.deleteAll();
	}


	@Override
	public Iterable<Student> deleteAllStudent(int id)
	{

		return ri.findAll();
	}

}
