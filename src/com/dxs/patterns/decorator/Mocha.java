package com.dxs.patterns.decorator;
/**
 * 这是一个摩卡装饰者 继承自CondimentDecorator
 * @author Administrator
 *
 */
public class Mocha extends CondimentDecorator{
	
	//为了让Mocha能够引用一个Beverage
	//用一个Beverage实例变量记录饮料，也就是被装饰者
	//利用构造方法，将饮料记录
	Beverage beverage;
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	
	
	public String getDescription() {
		// 饮料会将mocha也加在描述上
		return beverage.getDescription() + ", Mocha";
	}
	public double cost() {
		// 要计算加mocha的 饮料的价格 使用饮料价格 + mocha价格
		return 0.20 + beverage.cost();
	}
}
