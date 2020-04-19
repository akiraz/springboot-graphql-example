package com.akiraz.graphqlexample.entities;

import com.akiraz.graphqlexample.enums.LessonName;

public class Lesson {

	private LessonName lessonName;
	private String teacherName;

	public LessonName getLessonName() {
		return lessonName;
	}

	public void setLessonName(LessonName lessonName) {
		this.lessonName = lessonName;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
}
