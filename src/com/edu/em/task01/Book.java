package com.edu.em.task01;

public class Book {

	private String title = "Fight Club";

	class Author {

		private String name = "Chuck Palahniuk";
		int age = 62;

		void printBook() {
			System.out.println("Книга - " + title + ", автор - " + name + ".");
		}

	}

}
