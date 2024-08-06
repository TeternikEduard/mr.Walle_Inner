package com.edu.em.task05;

public class Main05 {

	public static void main(String[] args) {

		Greeting gr = new Greeting() {

			@Override
			public void sayHello() {

				System.out.println("\n\tHello, Java!");
			}
		};
		
		gr.sayHello();
	
	}
}