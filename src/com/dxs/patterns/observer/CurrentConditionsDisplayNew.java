package com.dxs.patterns.observer;

import java.util.Observable;
/**
 * 使用JDK 自带的观察者
 * @author dengxusheng
 *
 */
public class CurrentConditionsDisplayNew implements java.util.Observer,DisplayElement{
	
	Observable observable;
	private float temp;
	private float humidity;
	
	public CurrentConditionsDisplayNew(Observable observable) {
		super();
		this.observable = observable;
		observable.addObserver(this);
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("qweqweqweqwe");
	}
	public void update(Observable observable, Object obj) {
		// 调用update方法
		if(obj instanceof WeatherDataNew){
			WeatherDataNew weatherDataNew = (WeatherDataNew)obj;
			this.temp = weatherDataNew.getTemp();
			this.humidity = weatherDataNew.getHumidity();
			display();
		}
	}
}
