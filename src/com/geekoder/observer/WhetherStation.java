package com.geekoder.observer;

import java.util.ArrayList;
import java.util.List;

public class WhetherStation implements Subject {

	private int pressure ;
	private int temperature ;
	private int humidity ;
	private List<Observer> observerList ;
	
	public WhetherStation() {
		this.observerList = new ArrayList<>() ;
	}
	
	
	@Override
	public void addObserver(Observer o) {
		this.observerList.add(o) ;
	}

	@Override
	public void removeObserver(Observer o) {
		this.observerList.remove(o) ;
	}

	@Override
	public void notifyAllObervers() {
		for(Observer o: this.observerList){
			o.update(pressure, temperature, humidity);
		}
	}


	public void setPressure(int pressure) {
		this.pressure = pressure;
		notifyAllObervers() ;
	}


	public void setTemperature(int temperature) {
		this.temperature = temperature;
		notifyAllObervers() ;
	}


	public void setHumidity(int humidity) {
		this.humidity = humidity;
		notifyAllObervers() ;
	}
	
	

}
