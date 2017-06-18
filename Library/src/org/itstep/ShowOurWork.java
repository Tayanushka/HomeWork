package org.itstep;

//import java.security.acl.Group;

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
		//System.out.println("Name: " + student.getName() + " Course - " + student.getCourse() );
//		ListOfBooks group = new ListOfBooks();
//		
//		for (int i=0; i<6; i++){
//			Books books = new Books(("Philosophy" + (i+1))," Kant" , 2);
//			if (i >2) {
//				Books books = new Books(("Thinking in Java" + (i+1))," Eckel" , 4);
//			if (i>3) {
//				Books books = new Books(("Happy Time" + (i+1)), "Noname", 5 );
//			}
//			group.addBooksToList(books);
//			}
		//}
	}

	
}
