package org.itstep;

import java.util.ArrayList;

public class ShowOurWork {

	public static void main(String[] args) {
		
		ListOfStudent group = new ListOfStudent();
				
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
		for (Student student : group.getStudents()){
		System.out.println("Name: " + student.getName() + " Course - " + student.getCourse() );
		}

		public void setBooks(){
		Books book1 = new Books("Philosophy", " Kant", 2);
		Books book2 = new Books("Economy", " Marks", 2);
		Books book3 = new Books("Thinking in Java", " Eckel", 4);
		Books book4 = new Books("Learning C++", " Bill", 4);		
		Books book5 = new Books("Happy Time", " Osho", 5);		
		Books book6 = new Books("Freedom", " Erst", 5);
		book.add(book1);
		book.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);		
		books.add(book6);}
		
		}
	}

	

