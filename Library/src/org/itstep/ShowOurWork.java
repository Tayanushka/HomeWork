package org.itstep;

public class ShowOurWork {

	public static void main(String[] args) {
		
		for (int i = 0; i < 30; i++) {
			Student student = new Student(("John" + (i + 1)), 2);
			if (i > 10) {
				student = new Student(("Ann" + (i + 1)), 4);
				if (i > 20) {
					student = new Student(("Bill" + (i + 1)), 5);
			}
			group.addStudentToList(student);

		}
	}
	}

}
