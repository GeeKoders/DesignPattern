package com.geekoder.solid.l;

public class ElectricCar implements ElectricVehicle {

	@Override
	public void speed() {
		System.out.println("Speed up electric car...");
	}

	@Override
	public void chargeBattery() {
		System.out.println("Charging the battery...");
	}

}
