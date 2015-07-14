package com.dxs.patterns.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList observers;
	private float temp;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observers = new ArrayList();
	}
	
	public void registerObserver(Observer o) {
		//注册观察者时加到ArrayList中
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		// 观察者想要取消注册，从ArrayList中删除即可
		int i = observers.indexOf(o);
		if(i >= 0){
			observers.remove(i);
		}
	}

	public void notifyObserver() {
		// 把状态告诉每一位观察者
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(temp, humidity, pressure);
		}
	}
	
	//当从气象站得到更新观测值时
	public void measurementsChanged(){
		notifyObserver();
	}
	
	public void setMeasurements(float temp,float humidity,float pressur){
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressur;
		measurementsChanged();
	}

}
