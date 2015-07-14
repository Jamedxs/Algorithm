package com.dxs.patterns.decorator;

/**
 * 首先，必须让CondimentDecorator 能够取代Beverage，
 * 所以将CondimentDecorator扩展自Beverage类
 * @author Administrator
 *
 */
public abstract class CondimentDecorator extends Beverage{
	//所有的调料装饰者都必须重新实现getDescription()方法
	public abstract String getDescription();
}
