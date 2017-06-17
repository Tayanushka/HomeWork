package org.itstep;

public class Student extends Users {
	private int course;
	
	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public Student() {
		
		}
	public Student(String name, int course) {
	//public Student(String login, String pass, String name, String city, int course) {
		//this.setCity(city);
		//this.setLogin(login);
		this.setName(name);
		//this.setPass(pass);
		this.setCourse(course);
	}
}
