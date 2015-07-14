package com.dxs.patterns.observer;
/**
 * 观察者模式的主题 subject
 * @author Administrator
 *
 */
public interface Subject {
	/**
	 * 这两个方法都需要一个观察者变量，该观察者是用来注册或被删除的
	 * @param o
	 * @author dengxusheng
	 * 2015-5-18
	 */
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	//当主题状态改变时，这个方法会被调用，以通知所有的观察者。
	public void notifyObserver();
}
