package com.edu.em.task07;

public class Main07 {

	public static void main(String[] args) {
		
		double r = 4;

		Shape circle = new Shape() {

			@Override
			double area() {

				return Math.PI * r * r;
				
			}
		};
		
		System.out.println(circle.area());
	}
}