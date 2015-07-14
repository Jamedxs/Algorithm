package com.dxs.patterns.decorator;

/**
 * 浓缩咖啡  继承Beverage 因为这也是一种饮料
 * @author Administrator
 *
 */
public class Espresso extends Beverage{
	
	//为了设置饮料的描述，写了一个构造器，description实例变量继承自Beverage
	public Espresso(){
		description = "Espresso";
	}
	
	@Override
	public double cost() {
		// 计算浓缩咖啡的价格  直接返回价格即可
		return 1.99;
	}
}
