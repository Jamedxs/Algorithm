package com.dxs.patterns.observer;

import java.util.Observable;
/**
 * 使用java内置的 观察者方法
 * @author dengxusheng
 *
 */
public class WeatherDataNew extends Observable{
	private float temp;
	private float humidity;
	private float pressure;
	
	public WeatherDataNew() {
		// TODO Auto-generated constructor stub
	}
	public void measurementsChanged(){
		//在调用notifyObservers之前，要先调用setChanged()来指示状态已经改变。
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temp,float humidity,float pressur){
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressur;
		measurementsChanged();
	}
	
	//因为需要使用 “拉”的做法，所以创建这些get方法
	public float getTemp() {
		return temp;
	}
	public float getHumidity() {
		return humidity;
	}
	public float getPressure() {
		return pressure;
	}
}
