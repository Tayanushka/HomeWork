package org.itstep;

public class Books {
	private String bookTitle;
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	private String author;
	
	private int forCourse;
	public int getForCourse() {
		return forCourse;
	}
	public void setForCourse(int forCourse) {
		this.forCourse = forCourse;
	}
	public Books (String bookTitle, String author, int forCourse) {
		this.setBookTitle(bookTitle);
		this.setAuthor(author);
		this.setForCourse(forCourse);
	}
}
