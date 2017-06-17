package org.itstep;

import java.util.ArrayList;

public class ListOfStudent {
	private ArrayList<Student> students = new ArrayList<>();

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void addStudentToList(Student student) {
		students.add(student);
	}

}
