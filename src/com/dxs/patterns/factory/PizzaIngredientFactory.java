package com.dxs.patterns.factory;
/**
 * 建造一个工厂来生产制作pizza的原材料
 * @author dengxusheng
 * 2015-5-27
 */
public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}
