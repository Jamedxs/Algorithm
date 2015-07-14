package com.dxs.patterns.decorator;

public class StarbuzzCoffee {
	public static void main(String[] args) {
		Beverage beverage = new Espresso();//需要一杯浓缩开发
		System.out.println(beverage.getDescription() +" $" + beverage.cost());
		
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Mocha(beverage2);//加mocha  用mocha装饰它
		beverage2 = new Mocha(beverage2);//再加一份mocha  用第二个mocha装饰它
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
	}
}
