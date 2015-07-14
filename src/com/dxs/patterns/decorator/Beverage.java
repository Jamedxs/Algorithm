package com.dxs.patterns.decorator;

public abstract class Beverage {
	String description = "Unknow Bevarage";
	
	//getDescription()已经在这里实现  cost() 方法需要在子类中实现
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
}
