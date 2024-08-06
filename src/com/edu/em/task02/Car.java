package com.edu.em.task02;

public class Car {
	
	String model =  "Tesla Model S";
	int age = 2017;

	class Engine {
		
		String type = "electric motor";
		int power = 320;

	}
	
	Engine engine = new Engine();
	
	void printCar() {
		System.out.println("Model <" + model + ">, age '" + age + "', type '" + engine.type + "', power (H.P) = " + engine.power + " h.p.");
	}

}
