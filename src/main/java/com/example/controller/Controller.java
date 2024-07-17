package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.model.Student;
import com.example.servicei.ServiceI;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	ServiceI si;
	
	@PostMapping("saveStudent")
	public String saveStudent(@RequestBody Student s)
	{
		si.saveStudent(s);
		
		return "data added";
	}
	
	@DeleteMapping("deleteStudent")
	public String deleteStudent(@PathVariable int Id)
	{
		si.deleteStudent(Id);
		
		return "delete by id";
	}
	
	@GetMapping("getStudent/{Id}")
	public String getStudent(@PathVariable int Id)
	{
		si.getStudent(Id);
		
		return "view Id";
	}
	
	@PutMapping("updteStudent/{id}")
	public String updteStudent(@PathVariable int id, Student s)
	{
		si.updteStudent(id);
		si.saveStudent(s);
		
		return "update Student";
	}
	
	@DeleteMapping("deleteAllStudent")
	public String deleteAllStudent()
	{
		si.deleteAllStudent();
		
		return "delete all id";
	}
	
	@GetMapping("getAllStudent/{id}")
	public Iterable<Student> deleteAllStudent(@PathVariable int id)
	{
		return si.deleteAllStudent(id);
	}
	
	
}
