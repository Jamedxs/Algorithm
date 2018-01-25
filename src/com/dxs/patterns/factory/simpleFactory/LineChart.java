package com.dxs.patterns.factory.simpleFactory;

/**
 * Created by dengxusheng on 2018-01-25.
 */
//折线图类：具体产品类
public class LineChart implements Chart{
    public LineChart() {
        System.out.println("创建折线图！");
    }

    public void display() {
        System.out.println("显示折线图！");
    }
}
