package com.geekoder.adapter;

public class App {
	
	/**
	 * 
	 * Adapter Pattern - converts an interface of a class into an 
	 * 		other interface the clients expect !!!
	 * 
	 * 
	 * 			- it enables classes working together that could not otherwise 
	 * 				because of the incompatible interfaces
	 * 
	 * 			- composition is very important !!! Favor composition over inheritance
	 * 
	 */

	public static void main(String[] args) {
		
		Vehicle bus = new Bus() ;
		Vehicle car = new Car() ;
		Vehicle bicycle = new BicycleAdapter(new Bicycle()) ;
		
		bus.accelerate(); 
		car.accelerate();
		bicycle.accelerate();
		
	}

}
