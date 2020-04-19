package com.akiraz.graphqlexample.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.akiraz.graphqlexample.entities.Lesson;
import com.akiraz.graphqlexample.entities.Student;
import com.akiraz.graphqlexample.enums.LessonName;

@Component
public class StudentRepository {

	public static final List<Student> studentList;

	static {
		studentList = new ArrayList<>();

		Student student = new Student();
		student.setId(1l);
		student.setName("Edi");
		student.setAge(10);

		Lesson lesson = new Lesson();
		lesson.setLessonName(LessonName.MATHEMATICS);
		lesson.setTeacherName("Cookie Monster");
		student.setLesson(lesson);

		studentList.add(student);

		student = new Student();
		student.setId(2l);
		student.setName("Büdü");
		student.setAge(10);

		lesson = new Lesson();
		lesson.setLessonName(LessonName.MATHEMATICS);
		lesson.setTeacherName("Cookie Monster");
		student.setLesson(lesson);

		studentList.add(student);

	}

	public List<Student> getAllStudents() {
		return studentList;

	}

	public Student getStudent(String name) {
		for (Student student : studentList) {
			if (student.getName().equals(name)) {
				return student;
			}
		}
		return null;
	}

}
