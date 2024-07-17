package com.example.repositoryi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Student;

@Repository
public interface RepositoryI extends JpaRepository<Student, Integer> {

	void findbyId(int id);

}
