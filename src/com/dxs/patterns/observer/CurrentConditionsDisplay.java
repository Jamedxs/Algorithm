package com.dxs.patterns.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temp;
	private float humidity;
	private Subject weatherData;
	
	
	//需要主题对象，作为注册之用
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("ddddddd");
	}

	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temp = temp;
		this.humidity = humidity;
		display();
	}

}
