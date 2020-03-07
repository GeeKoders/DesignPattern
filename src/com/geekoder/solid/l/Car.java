package com.geekoder.solid.l;

public class Car implements NormalVehicle {

	@Override
	public void speed() {
		System.out.println("Speed up the car...");
	}

	@Override
	public void addFuel() {
		System.out.println("Adding fuel to car...") ;
	}

}
