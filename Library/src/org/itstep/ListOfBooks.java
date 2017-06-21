package org.itstep;

import java.util.ArrayList;

public class ListOfBooks {
	private ArrayList<Books> book = new ArrayList<>();

	public ArrayList<Books> getBook() {
		return book;
	}

	public void addBooks(Books books) {
		book.add(books);
	}

	}
	

