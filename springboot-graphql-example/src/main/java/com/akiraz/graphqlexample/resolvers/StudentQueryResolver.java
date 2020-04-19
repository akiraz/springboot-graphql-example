package com.akiraz.graphqlexample.resolvers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.akiraz.graphqlexample.entities.Student;
import com.akiraz.graphqlexample.repo.StudentRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class StudentQueryResolver implements GraphQLQueryResolver {

	@Autowired	
	private StudentRepository studentRepository;
	
	public List<Student> getAllStudents() {
		return studentRepository.getAllStudents();

	}

	public Student getStudent(String name) {
		return studentRepository.getStudent(name);
	}
	

}